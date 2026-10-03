package com.example.CircularCoreJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class OrderService {

    @Autowired 
    private PaymentService paymentService;

    public void placeOrder() {
        paymentService.processPayment();
        getOrderDetails();
        System.out.println("Order placed successfully.");
    }
    public void getOrderDetails() {
        System.out.println("Fetching order details...");
    }

}
