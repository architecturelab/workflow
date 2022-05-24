package com.architecturelab.inventory.application.controller;

import com.architecturelab.inventory.core.domain.item.ItemInput;
import com.architecturelab.inventory.useCases.item.ItemInputUseCases;
import com.architecturelab.inventory.useCases.item.ItemOutputUseCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private ItemInputUseCases itemInputUseCases;

    @Autowired
    private ItemOutputUseCases itemOutputUseCases;

    @GetMapping("/items-plain")
    public ResponseEntity<List<ItemInput>> getAllItemsPlain() {
        try {
            List<ItemInput> items = itemInputUseCases.getAll();
            if (items.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/items")
    public String getAllItems() {
        //getItemOutputUseCase.execute();
        return "Get items";
    }

    @GetMapping("/item/{id}")
    public ResponseEntity<ItemInput> getItemById(@PathVariable Long id) {
        try {
            ItemInput item = itemInputUseCases.getById(id);
            if (item != null) {
                return new ResponseEntity<>(item, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/item")
    public ResponseEntity<ItemInput> createItem(@RequestBody ItemInput itemInput) {
        try {
            ItemInput _item = itemInputUseCases.create(itemInput);
            return new ResponseEntity<>(_item, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/item")
    public ResponseEntity<ItemInput> updateItem(@RequestBody ItemInput itemInput) {
        try {
            ItemInput item = itemInputUseCases.update(itemInput);
            if (item !=null) {
                return new ResponseEntity<>(item, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
