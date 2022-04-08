package com.architecturelab.inventory.application.controller;

import com.architecturelab.inventory.core.item.service.ItemService;
import com.architecturelab.inventory.core.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private UserService userService;

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
