package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@CrossOrigin(origins = "*") // Enable CORS for all origins
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    // DELETE all items
    @DeleteMapping("/deleteAll")
    public void deleteAllItems() {
        itemRepository.deleteAll();
    }
}
