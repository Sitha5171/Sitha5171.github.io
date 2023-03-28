package com.example.uniquemart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.uniquemart.model.Item;
import com.example.uniquemart.service.ItemService;

@RestController

public class ItemController {

	@Autowired

	ItemService itemService;

	public ItemController(@Autowired ItemService itemService) {

		this.itemService = itemService;

	}

	@GetMapping("/item")

	public Iterable<Item> getAllPost() {

		return itemService.findAll();

	}
	
	@GetMapping("/item/{id}")
	public Item findById(@PathVariable("id") int id) {
		return  itemService.findById(id);

	}

	@PostMapping("/item")
	public Item save(@RequestBody Item item) {
		return itemService.save(item);
	}

	@DeleteMapping("/item/{id}")
	public void delete(@PathVariable int id) {
		itemService.delete(id);

	}

	@PutMapping("/item")
	public Item update(@RequestBody Item item) {
		return itemService.save(item);
	}


}
