package com.diximonline.cbspaymentsimulator.acxf.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.diximonline.cbspaymentsimulator.acxf.services.BanksMiddlewarePE07COT00Impl;

import jakarta.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

	private final BanksMiddlewarePE07COT00Impl pe07cotService;

    public CxfConfig(BanksMiddlewarePE07COT00Impl pe07cotService) {
        this.pe07cotService = pe07cotService;
    }

    @Bean
    public Endpoint endpoint(Bus bus) {
        EndpointImpl endpoint = new EndpointImpl(bus, pe07cotService);
        endpoint.publish("/BanksMiddleware_PE07COT00Port");
        return endpoint;
    }
}
