package com.example.cbspaymentsimulator.service;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Queue;
import jakarta.jms.TextMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ActiveMqService {

    private final JmsTemplate jmsTemplate;
    private final Queue mtQueue;

    public void sendToQueue(String message) {
        try {
            jmsTemplate.send(mtQueue, session -> session.createTextMessage(message));
            log.info("Message sent to queue '{}'", mtQueue.getQueueName());
        } catch (JMSException e) {
            log.error("Failed to send message to queue", e);
            throw new RuntimeException("Failed to send message", e);
        }
    }

    public String receiveFromQueue() {
        try {
            Message message = jmsTemplate.receive(mtQueue);
            if (message instanceof TextMessage textMessage) {
                String payload = textMessage.getText();
                log.info("Received message from queue '{}':\n{}", mtQueue.getQueueName(), payload);
                return payload;
            } else {
                log.warn("Received non-text message or null");
                return null;
            }
        } catch (JMSException e) {
            log.error("Failed to receive message", e);
            throw new RuntimeException("Failed to receive message", e);
        }
    }
}
