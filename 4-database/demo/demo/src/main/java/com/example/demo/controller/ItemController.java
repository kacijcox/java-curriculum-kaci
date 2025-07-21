package com.example.demo.controller;
import data.model.Item;
import data.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item") // localhost:8080/items
@Repository

public class ItemController {
	@Autowired
	ItemRepository itemRepository;

	@GetMapping()
	public List<Item> getItems() {
		return itemRepository.findAll();
	}
}

