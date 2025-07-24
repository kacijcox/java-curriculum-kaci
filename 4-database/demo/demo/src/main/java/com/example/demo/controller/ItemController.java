package com.example.demo.controller;

import data.model.Item;
import data.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item") // localhost:8080/items
public class ItemController {

	@Autowired
	ItemRepository itemRepository;

	@GetMapping()
	public ResponseEntity<List<Item>> getItems() {
		List<Item> items = itemRepository.findAll();
		return ResponseEntity.ok().body(items);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Item> getItem(@PathVariable Integer id) {
		// itemRepository.findById(id); ← unnecessary line removed
		Optional<Item> itemOptional = itemRepository.findById(id);
		if (itemOptional.isPresent()) {
			return ResponseEntity.ok(itemOptional.get());
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		// the following are also valid ways of returning the same response entity
		// return ResponseEntity.notFound().build();
		// return ResponseEntity.status(404).build();
	}

	@PostMapping  // inserting new data
	public ResponseEntity<Item> addItem(@RequestBody Item item) {
		// save() or saveAndFlush() persist changes to our model in our db
		item = itemRepository.saveAndFlush(item);
		System.out.println(item);
		return ResponseEntity.status(HttpStatus.CREATED).body(item);
	}

	@PutMapping  // PUT for updating existing data
	public ResponseEntity<Item> updateItem(@RequestBody Item item) {
		// we want to make sure the item we are updating exists in the database
		// we will use the optional.isPresent() to validate it's a record that exists
		Optional<Item> itemOptional = itemRepository.findById(item.getItemId());
		if (itemOptional.isPresent()) {
			// save() and saveAndFlush() persist changes to our models to the DB
			// we want to make sure we are saving the item that was a parameter to this method
			// not the optional that we used to check its existence
			return ResponseEntity.ok(itemRepository.saveAndFlush(item));
		}
		// if nothing was updated, then we want to return null to indicate an issue
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteItem(@PathVariable Integer id) { // Changed from itemId to id
		itemRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	// inserting new data

	// @PutMapping  // PUT for updating existing data
	// public Item updateItem(@RequestBody Item item) {
	//     System.out.println(item);
	//     item = itemRepository.saveAndFlush(item);
	//     System.out.println(item);
	//     return item;
	// }
}
