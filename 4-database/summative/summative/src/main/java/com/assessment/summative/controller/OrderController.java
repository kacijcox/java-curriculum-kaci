package com.assessment.summative.controller;

import com.assessment.summative.data.model.Item;
import com.assessment.summative.data.model.Order;
import com.assessment.summative.data.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")

public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping()
    public ResponseEntity<List<Order>> getItems() {
        List<Order> orders = orderRepository.findAll();
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/{orderId}") // localhost:8080/item/1
    public ResponseEntity<Order> getOrder(@PathVariable Integer orderId) {
        Optional<Order> orderOptional = orderRepository.findById(orderId);
        if(orderOptional.isPresent()){
            return ResponseEntity.ok(orderOptional.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping(params = "order_date")  // localhost:8080/customer?city=Austin
    public ResponseEntity<List<Order>> getOrderDate(@RequestParam(name = "order_date", required = false) String orderDate) {
        return ResponseEntity.ok(orderRepository.findByOrderDate(LocalDateTime.parse(orderDate)));
    }

    @GetMapping(params = "server_id")
    public ResponseEntity<List<Order>> getOrdersByServerId(@RequestParam(name = "server_id") Integer serverId) {
        return ResponseEntity.ok(orderRepository.findByServerId(serverId));
    }


    @PostMapping  // POST http method for inserting new data
    public ResponseEntity<Order> addOrder(@RequestBody Order order) {
        order.setOrderId(null);
        order = orderRepository.saveAndFlush(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(order);

    }


    @PutMapping  // PUT http method for updating existing
    public ResponseEntity<Order> updateOrder(@RequestBody Order order) {
        Optional<Order> orderOptional = orderRepository.findById(order.getOrderId());
        if(orderOptional.isPresent()) {
            return ResponseEntity.ok(orderRepository.saveAndFlush(order));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{orderId}") // DELETE http method for removing data from the database
    public ResponseEntity<Void> deleteOrder(@PathVariable Integer orderId) {  // localhost:8080/item/15
        orderRepository.deleteById(orderId); // pass the primary key of the item you want to remove
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
