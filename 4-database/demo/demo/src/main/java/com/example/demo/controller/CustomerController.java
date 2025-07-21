package com.example.demo.controller;

import data.model.Customer;
import data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer") // localhost:8080/customers
@Repository

public class CustomerController {
	@Autowired
	CustomerRepository customerRepository;

	@GetMapping()
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}
}

