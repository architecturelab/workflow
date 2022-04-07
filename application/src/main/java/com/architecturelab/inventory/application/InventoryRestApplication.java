package com.architecturelab.inventory.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication(scanBasePackages = "com.architecturelab.inventory")
@RestController
public class InventoryRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryRestApplication.class, args);
    }

    @GetMapping("/items")
    public String getAllItems() {
        return "";
    }

    @GetMapping("/item/{id}")
    public String getItemById(@PathVariable Long id) {
        return "";
    }

    @PostMapping("/item/")
    public String createItem() {
        return "";
    }

    @PutMapping("/item/{id}")
    public String updateItem(@PathVariable Long id) {
        return "";
    }
}
