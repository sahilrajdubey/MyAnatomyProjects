package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class XmlBasesConfigDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// Retrieve the OrderService bean from the context and by type
		//OrderService orderService = context.getBean(OrderService.class);
		// get the bean by its id/name
		OrderService orderService1 = (OrderService) context.getBean("orderService");
		orderService1.placeOrder();

		SpringApplication.run(XmlBasesConfigDemoApplication.class, args);
	}

}
