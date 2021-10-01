package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoForWebApplication {

	public static void main(String[] args) {
		System.out.println("Introducing spring web");
		SpringApplication.run(DemoForWebApplication.class, args);
	}

}
