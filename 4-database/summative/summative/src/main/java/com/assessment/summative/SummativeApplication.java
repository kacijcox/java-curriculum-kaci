package com.assessment.summative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.assessment.summative")
@EntityScan("com.assessment.summative.data.model")
@EnableJpaRepositories("com.assessment.summative.data.repository")


public class SummativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SummativeApplication.class, args);
	}

}
