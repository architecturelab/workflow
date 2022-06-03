package com.architecturelab.workflow.infra.config.kafka.consumer;

import org.apache.kafka.common.config.SslConfigs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {

    @Autowired
    private ConsumerFactory<Integer, Object> consumerFactory;

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Object> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, Object> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(new DefaultKafkaConsumerFactory<>(consumerConfig()));
        return factory;
    }

    private Map<String, Object> consumerConfig() {
        Map<String, Object> consumerConfig = new HashMap<>(consumerFactory.getConfigurationProperties());
        return consumerConfig;
    }
}
