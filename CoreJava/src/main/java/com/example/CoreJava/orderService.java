package com.example.CoreJava;

import com.example.CoreJava.Payment.PaymentService;



public class orderService {
    //dependency injection 
    private PaymentService paymentService; 
    public orderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    public void processOrder() {
        System.out.println("order placed");
        paymentService.payment();
    }
}
