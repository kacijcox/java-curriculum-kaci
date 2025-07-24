package com.example.demo.controller;
import data.model.Item;
import data.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

	@GetMapping("/{id}")
	public Item getItem(@PathVariable Integer id) {
		itemRepository.findById(id);
		Optional<Item> itemOptional = itemRepository.findById(id);
		return itemOptional.orElse(null);
	}


	@PostMapping  // inserting new data
	public Item addItem(@RequestBody Item item) {
		System.out.println(item);
		item = itemRepository.saveAndFlush(item);
		System.out.println(item);
		return item;
	}

	@PutMapping
	public Item updateItem(@RequestBody Item item) {
		// we want to make sure the item we are updating exists in the database
		// we will use the optional.IsPresent to validate its a recrod that exists

		Optional<Item> itemOptional = itemRepository.findById(item.getItemId());
		if (itemOptional.isPresent()) {
			// save() and saveFlush() presist chanegs to out models ato the DB
			// we want to make sure we are saving the item that was a parameter to this method
			// not the optional thaty we used to check its existant
			return itemRepository.saveAndFlush(item);
		}
		// if nothing was updated, then we want to return null to indicate an issue
		return null;
	}
	//inserting new data

//	@PutMapping  // PUT for updating existing data
//	public Item updateItem(@RequestBody Item item) {
//		System.out.println(item);
//		item = itemRepository.saveAndFlush(item);
//		System.out.println(item);
//		return item;

	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable Integer id) { // Changed from itemId to id
		itemRepository.deleteById(id);
	}
	}
	//inserting new data


