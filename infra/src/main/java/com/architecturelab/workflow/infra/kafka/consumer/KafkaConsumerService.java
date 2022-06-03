package com.architecturelab.workflow.infra.kafka.consumer;

import com.architecturelab.workflow.infra.kafka.domain.Message;

public interface KafkaConsumerService {
    void receive(Message message);
}
