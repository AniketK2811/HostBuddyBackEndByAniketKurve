package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Item;
import com.app.repository.ItemRepository;

//ItemController.java
@RestController
@RequestMapping("/api/items")
@CrossOrigin("*")
public class ItemController {
	@Autowired
 private final ItemRepository itemRepository;

 public ItemController(ItemRepository itemRepository) {
     this.itemRepository = itemRepository;
 }

 @PostMapping
 public Item addItem(@RequestBody Item item) {
     return itemRepository.save(item);
 }

 @GetMapping
 public List<Item> getAllItems() {
     return itemRepository.findAll();
 }

 @GetMapping("/search/{name}")
 public List<Item> searchItems(@PathVariable("name") String name) {
     return itemRepository.findByNameContainingIgnoreCase(name);
 }
}




