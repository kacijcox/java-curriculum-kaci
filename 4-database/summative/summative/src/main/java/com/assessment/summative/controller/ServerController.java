package com.assessment.summative.controller;


import com.assessment.summative.data.model.Order;
import com.assessment.summative.data.model.Server;
import com.assessment.summative.data.repository.OrderRepository;
import com.assessment.summative.data.repository.OrderItemRepository;
import com.assessment.summative.data.repository.ServerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/server")

public class ServerController {

    @Autowired
    ServerRepository serverRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderItemRepository orderItemRepository;

    @GetMapping()
    public ResponseEntity<List<Server>> getServer() {
        List<Server> server = serverRepository.findAll();
        return ResponseEntity.ok(server);
    }

    @GetMapping("/{serverId}") // localhost:8080/item/1
    public ResponseEntity<Server> getServer(@PathVariable Integer serverId) {
        Optional<Server> serverOptional = serverRepository.findById(serverId);
        if (serverOptional.isPresent()) {
            return ResponseEntity.ok(serverOptional.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping(params = "server_id")
    public ResponseEntity<List<Server>> getServersByServerId(@RequestParam(name = "server_id") Integer serverId) {
        return ResponseEntity.ok(serverRepository.findByServerId(serverId));
    }

    // get server where term_date is null
    @GetMapping("/current")
    public ResponseEntity<List<Server>> getCurrentServers() {
        List<Server> currentServers = serverRepository.findByTermDateIsNull();
        return ResponseEntity.ok(currentServers);
    }

    @PostMapping  // POST http method for inserting new data
    public ResponseEntity<Server> addServer(@RequestBody Server server) {
        server.setServerId(null);
        server = serverRepository.saveAndFlush(server);
        return ResponseEntity.status(HttpStatus.CREATED).body(server);
    }

    @PutMapping  // PUT http method for updating existing
    public ResponseEntity<Server> updateServer(@RequestBody Server server) {
        Optional<Server> serverOptional = serverRepository.findById(server.getServerId());
        if (serverOptional.isPresent()) {
            return ResponseEntity.ok(serverRepository.saveAndFlush(server));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{serverId}")
    @Transactional
    public ResponseEntity<Void> deleteServer(@PathVariable Integer serverId) {
        List<Order> orders = orderRepository.findByServerId(serverId);

        for (Order order : orders) {
            orderItemRepository.deleteByOrderId(order.getOrderId());
        }
        orderRepository.deleteAll(orders);

        serverRepository.deleteById(serverId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
