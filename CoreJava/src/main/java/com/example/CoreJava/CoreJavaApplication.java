package com.example.CoreJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@SpringBootApplication
public class CoreJavaApplication {

	public static void main(String[] args) {
		
	try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class))

	{
	    orderService orderService = context.getBean(orderService.class);
	    orderService.processOrder();

		User user = context.getBean(User.class);
		System.out.println("User name: " + user.getName());
		System.out.println("User age: " + user.getAge());
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		
	}
		SpringApplication.run(CoreJavaApplication.class, args);
	}

}

