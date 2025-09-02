package com.diximonline.cbspaymentsimulator.builder;

public interface SoapMessageBuilder {
    String buildXmlFromJson(String rawJson);
}
