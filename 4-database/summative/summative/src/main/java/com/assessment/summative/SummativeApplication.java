package com.assessment.summative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class SummativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SummativeApplication.class, args);
	}

}
