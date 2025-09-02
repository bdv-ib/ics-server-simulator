package com.diximonline.cbspaymentsimulator.controller;

import com.diximonline.cbspaymentsimulator.builder.SoapMessageBuilder;
import com.diximonline.cbspaymentsimulator.service.ActiveMqService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ics")
@Slf4j
public class BanksMiddlewareSimulatorController {

    private final ApplicationContext context;

    public BanksMiddlewareSimulatorController(
            ApplicationContext context, @Qualifier("pe07cotMarshaller") Jaxb2Marshaller marshaller,
            ActiveMqService activeMqService
    ) {
        this.context = context;
        this.marshaller = marshaller;
        this.activeMqService = activeMqService;
    }

    @Qualifier("pe07cotMarshaller")
    private final Jaxb2Marshaller marshaller;
    private final ActiveMqService activeMqService;

    @PostMapping("/send")
    public ResponseEntity<String> sendAnyCot(@RequestParam("type") String type, @RequestBody String rawJson) {
        try {
            SoapMessageBuilder builder = (SoapMessageBuilder) context.getBean(type.toLowerCase());

            String xml = builder.buildXmlFromJson(rawJson);
            log.info("✅ Marshalled XML for type '{}':\n{}", type, xml);

            activeMqService.sendToQueue(xml);
            return ResponseEntity.ok("Message sent to queue");

        } catch (NoSuchBeanDefinitionException e) {
            return ResponseEntity.badRequest().body("Unsupported type: " + type);
        } catch (Exception e) {
            log.error("❌ Failed to process message", e);
            return ResponseEntity.internalServerError().body("Error: " + e.getMessage());
        }
    }
}
