package com.example.BeamScopeDemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan ("com.example.BeamScopeDemo")
public class AppConfig {
//Two beans of the same type can be defined in the configuration class. In this case, we have two beans of type OrderService defined with different names (getOrder and getOrder2). When we request a bean of type OrderService from the application context, Spring will return the first bean it finds (getOrder) by default. If we want to get the second bean (getOrder2), we can specify its name when requesting it from the context.
    @Bean
    public OrderService getOrder() {
        return new OrderService();
    }

    @Bean 
    public OrderService getOrder2() {
        return new OrderService();
    }
    
}
