package com.example.BeamScopeDemo;

import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;

//@Component 
@Scope ("singleton")
public class OrderService {

    public OrderService() {
        System.out.println("OrderService instance created: ");
    }

    public void placeOrder() {
        System.out.println("OrderService instance created: " );
    }
}
