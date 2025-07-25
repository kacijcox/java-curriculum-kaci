package com.assessment.summative.controller;
import com.assessment.summative.data.model.Item;
import com.assessment.summative.data.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item") // localhost:8080/item
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping()
    public ResponseEntity<List<Item>> getItems() {
        List<Item> items = itemRepository.findAll();
        return ResponseEntity.ok(items);
    }

    @GetMapping("/{itemId}") // localhost:8080/item/1
    public ResponseEntity<Item> getItem(@PathVariable Integer itemId) {
        Optional<Item> itemOptional = itemRepository.findById(itemId);
        if(itemOptional.isPresent()){
            return ResponseEntity.ok(itemOptional.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        // the following are also valid ways of returning the same ResponseEntity
        // return ResponseEntity.notFound().build();
        // return ResponseEntity.status(404).build();
    }

    @PostMapping  // POST http method for inserting new data
    public ResponseEntity<Item> addItem(@RequestBody Item item) {
        // save() or saveAndFlush() persist changes to our models to the database
        item = itemRepository.saveAndFlush(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(item);

    }


    @PutMapping  // PUT http method for updating existing
    public ResponseEntity<Item> updateItem(@RequestBody Item item) {
        // we want to make sure the item we are updating exists in the database
        // we will use the optional.isPresent() to validate it's a record in the table
        Optional<Item> itemOptional = itemRepository.findById(item.getItemId());
        if(itemOptional.isPresent()) {
            // save() or saveAndFlush() persist changes to our models to the database
            // we want to make sure we are saving the item that was a parameter to this method
            // not the optional that we used to check its existence
            return ResponseEntity.ok(itemRepository.saveAndFlush(item));
        }
        // if nothing was updated, then we want to return null to indicate an issue
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{itemId}") // DELETE http method for removing data from the database
    public ResponseEntity<Void> deleteItem(@PathVariable Integer itemId) {  // localhost:8080/item/15
        itemRepository.deleteById(itemId); // pass the primary key of the item you want to remove
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
