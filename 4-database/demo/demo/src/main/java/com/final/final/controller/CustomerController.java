package com.example.demo.controller;
import data.model.Customer;
import data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	@GetMapping(params = "city")  // localhost:8080/customer?city=Austin
	public ResponseEntity<List<Customer>> getCustomersByCity(@RequestParam(name = "city", required = false) String city) {
		return ResponseEntity.ok(customerRepository.findByCity(city));
	}

	@GetMapping("/ready")
	public ResponseEntity<List<Customer>> getReadyForPickup() {
		return ResponseEntity.ok(customerRepository.getReadyForPickup());
	}

	@GetMapping("/status/{statusId}")// localhost:8080/customer/4
	public ResponseEntity<List<Customer>> getCustomersByOrderStatus(@PathVariable Integer statusId) {
		return ResponseEntity.ok(customerRepository.getByOrderStatus(statusId));
	}
}

