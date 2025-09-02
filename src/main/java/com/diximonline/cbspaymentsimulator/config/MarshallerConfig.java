package com.diximonline.cbspaymentsimulator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class MarshallerConfig {

    @Bean(name = "pe07cotMarshaller")
    public Jaxb2Marshaller pe07cotMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.diximonline.cbspaymentsimulator.ws.model.request",
                "com.diximonline.cbspaymentsimulator.ws.model.response");
        return marshaller;
    }

    @Bean(name = "pe07csmMarshaller")
    public Jaxb2Marshaller pe07csmMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.diximonline.cbspaymentsimulator.ws.model.pe07csm"); // на будущее
        return marshaller;
    }
}
