package com.example.CircularCoreJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CircularCoreJavaApplication {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			OrderService orderService = context.getBean(OrderService.class);
			orderService.placeOrder();	
			 
		}

		SpringApplication.run(CircularCoreJavaApplication.class, args);
	}

	}

