package com.example.demo.controller;
import data.model.Customer;
import data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/customer") // localhost:8080/customers

public class CustomerController {
	@Autowired
	CustomerRepository customerRepository;

	@GetMapping()
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@GetMapping("/{id}") // localhost:8080/customer/UUID
	public Customer getCustomer(@PathVariable UUID id) {
		Optional <Customer> customerOptional = customerRepository.findById(id);
			return customerOptional.orElse(null);
		}
}

