package com.example.BeamScopeDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeamScopeDemoApplication {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			OrderService orderService1 = context.getBean(OrderService.class);
	}
catch(Exception e){
	System.out.println("Exception in main method: " + e.getMessage());
}

		SpringApplication.run(BeamScopeDemoApplication.class, args);
	}

}
