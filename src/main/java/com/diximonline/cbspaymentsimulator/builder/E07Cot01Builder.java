package com.diximonline.cbspaymentsimulator.builder;

import com.diximonline.cbspaymentsimulator.converter.E07CotConverter;
import com.diximonline.cbspaymentsimulator.dto.E07Cot01JsonRequest;
import com.diximonline.cbspaymentsimulator.ws.model.response.E07COT01Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

@Component("e07cot01")
public class E07Cot01Builder implements SoapMessageBuilder {

    private final Jaxb2Marshaller marshaller;

    public E07Cot01Builder(@Qualifier("pe07cotMarshaller") Jaxb2Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    @Override
    public String buildXmlFromJson(String rawJson) {
        try {
            var dto = new com.fasterxml.jackson.databind.ObjectMapper()
                    .readValue(rawJson, E07Cot01JsonRequest.class);

            E07COT01Response response = E07CotConverter.toSoapResponse(dto);

            StringWriter writer = new StringWriter();
            marshaller.marshal(response, new StreamResult(writer));
            return writer.toString();

        } catch (Exception e) {
            throw new RuntimeException("❌ Failed to build XML for e07cot01", e);
        }
    }
}