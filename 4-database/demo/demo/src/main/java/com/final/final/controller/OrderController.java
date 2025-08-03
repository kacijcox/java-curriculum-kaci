package com.example.demo.controller;
import data.model.Login;
import data.model.Order;
import data.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order") // localhost:8080/login
@Repository

public class OrderController {
	@Autowired
	OrderRepository orderRepository;

	@GetMapping()
	public List<Order> getOrder() {
		return orderRepository.findAll();
	}
}
