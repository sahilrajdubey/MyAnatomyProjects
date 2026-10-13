package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCoreApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootCoreApplication.class, args);
		PaymentGateaway paymentGateaway = context.getBean(PaymentGateaway.class);
		paymentGateaway.printPaymentProperties();

		SpringApplication.run(SpringBootCoreApplication.class, args);
	}

}
