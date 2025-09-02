package com.example.cbspaymentsimulator.builder;

import com.example.cbspaymentsimulator.converter.E07CotConverter;
import com.example.cbspaymentsimulator.dto.E07Cot02JsonRequest;
import com.example.cbspaymentsimulator.ws.model.response.E07COT02Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

@Component("e07cot02")
public class E07Cot02Builder implements SoapMessageBuilder {

    private final Jaxb2Marshaller marshaller;

    public E07Cot02Builder(@Qualifier("pe07cotMarshaller") Jaxb2Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    @Override
    public String buildXmlFromJson(String rawJson) {
        try {
            var dto = new com.fasterxml.jackson.databind.ObjectMapper()
                    .readValue(rawJson, E07Cot02JsonRequest.class);

            E07COT02Response response = E07CotConverter.toSoapResponse(dto);

            StringWriter writer = new StringWriter();
            marshaller.marshal(response, new StreamResult(writer));
            return writer.toString();

        } catch (Exception e) {
            throw new RuntimeException("❌ Failed to build XML for e07cot02", e);
        }
    }
}