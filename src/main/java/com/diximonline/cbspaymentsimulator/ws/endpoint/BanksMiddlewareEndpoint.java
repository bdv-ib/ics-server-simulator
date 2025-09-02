package com.diximonline.cbspaymentsimulator.ws.endpoint;

import com.diximonline.cbspaymentsimulator.service.ActiveMqService;
import com.diximonline.cbspaymentsimulator.ws.model.response.E07COT01Response;
import com.diximonline.cbspaymentsimulator.ws.model.response.E07COT02Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

@Endpoint
@Slf4j
public class BanksMiddlewareEndpoint {

    public BanksMiddlewareEndpoint(
            ActiveMqService activeMqService,
            @Qualifier("pe07cotMarshaller") Jaxb2Marshaller marshaller) {
        this.activeMqService = activeMqService;
        this.marshaller = marshaller;
    }

    private static final String NAMESPACE = "http://com/icsfs/banks/ws/BanksMiddleware_PE07COT00.wsdl";

    private final ActiveMqService activeMqService;

    private final @Qualifier("pe07cotMarshaller") Jaxb2Marshaller marshaller;

    @PayloadRoot(namespace = NAMESPACE, localPart = "BanksMiddleware_PE07COT00_e07cot01")
    @ResponsePayload
    public E07COT01Response handleE07COT01(@RequestPayload Source request) {
        String xml = activeMqService.receiveFromQueue();
        log.info("✅ Received raw Source. Returning MT for e07cot01:\n{}", xml);
        return (E07COT01Response) marshaller.unmarshal(new StreamSource(new StringReader(xml)));
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "BanksMiddleware_PE07COT00_e07cot02")
    @ResponsePayload
    public E07COT02Response handleE07COT02() {
        String xml = activeMqService.receiveFromQueue();
        log.info("Returning MT for e07cot02:\n{}", xml);
        return (E07COT02Response) marshaller.unmarshal(new StreamSource(new StringReader(xml)));
    }
}
