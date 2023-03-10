package com.jacoco.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
		System.out.println("RESTful WS for jacoco demo started");
	}
}