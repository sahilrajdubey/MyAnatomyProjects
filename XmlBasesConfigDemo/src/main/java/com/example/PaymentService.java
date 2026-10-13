package com.example;


public class PaymentService {

    private String type;

    public PaymentService(String type) {
        this.type = type;
    }

    public void  processPayment() {
        System.out.println("Processing payment of type: " + type);
        System.out.println("Payment processed successfully!");
    }
}
