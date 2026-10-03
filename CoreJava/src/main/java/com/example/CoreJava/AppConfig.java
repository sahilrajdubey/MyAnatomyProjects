package com.example.CoreJava;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.CoreJava.Payment.PaymentService;
import com.example.CoreJava.Payment.UpiPayment;

import org.springframework.context.annotation.Bean;

@Configuration 
@ComponentScan("com.example.CoreJava")
public class AppConfig {
    @Bean
    public User user() {
        return new User("Sahil",21);
    }

    @Bean
    public PaymentService paymentService() {
        return new UpiPayment();    
    }
    
    @Bean
    public orderService orderService(PaymentService paymentService) {
        return new orderService(paymentService);
    }

}
