package com.example.demo.controller;
import data.model.Login;
import data.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login") // localhost:8080/login
@Repository

public class LoginController {
	@Autowired
	LoginRepository loginRepository;

	@GetMapping()
	public List<Login> getItems() {
		return loginRepository.findAll();
	}
}

