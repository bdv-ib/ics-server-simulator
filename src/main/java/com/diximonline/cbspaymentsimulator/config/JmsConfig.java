package com.diximonline.cbspaymentsimulator.config;

import jakarta.jms.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.apache.activemq.artemis.jms.client.ActiveMQQueue;

@Configuration
public class JmsConfig {

    @Bean
    public Queue mtQueue() {
        return new ActiveMQQueue("mtQueue");
    }
}