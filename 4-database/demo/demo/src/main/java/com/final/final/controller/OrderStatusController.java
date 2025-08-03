package com.example.demo.controller;
import data.model.OrderStatus;
import data.repository.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order_status") // localhost:8080/customers
@Repository

public class OrderStatusController {
	@Autowired
	OrderStatusRepository orderStatusRepository;

	@GetMapping()
	public List<OrderStatus> getCustomers() {
		return orderStatusRepository.findAll();
	}
}

