package com.architecturelab.inventory.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication(scanBasePackages = "com.architecturelab.inventory")
public class InventoryRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryRestApplication.class, args);
    }
}
