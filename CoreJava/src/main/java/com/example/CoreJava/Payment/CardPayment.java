package com.example.CoreJava.Payment;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("cp")
public class CardPayment implements PaymentService {
    @Override
    public void payment() {
        System.out.println("Card payment done");
    }
    
}
