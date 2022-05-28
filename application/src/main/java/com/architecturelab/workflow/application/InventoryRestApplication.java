package com.architecturelab.workflow.application;

import com.architecturelab.workflow.application.config.correlation.CorrelationIdInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@SpringBootApplication(scanBasePackages = "com.architecturelab.workflow")
public class InventoryRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryRestApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate() {
            {
                setInterceptors(Collections.singletonList(new CorrelationIdInterceptor()));
            }
        };
    }
}
