package com.architecturelab.workflow.infra.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumerServiceImpl.class);

    @KafkaListener(topics = "${app.spring.kafka.topic}")
    public void receive(@Payload Message message) {
        LOG.info(String.format("Message recieved -> %s", message));
    }
}
