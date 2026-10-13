package com.example;


public class OrderService {
    private PaymentService paymentService;
// argument constructor to inject the PaymentService dependency by xml configuration
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.processPayment();
        System.out.println("Order placed successfully!");
    }
    
}
