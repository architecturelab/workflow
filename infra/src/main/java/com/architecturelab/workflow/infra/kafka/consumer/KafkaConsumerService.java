package com.architecturelab.workflow.infra.kafka.consumer;

public interface KafkaConsumerService {
    void receive(Message message);
}
