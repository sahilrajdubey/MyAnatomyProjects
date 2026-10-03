package com.example.CoreJava.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
 
@Qualifier("up")
public class UpiPayment implements PaymentService {
    @Override
    public void payment() {
        System.out.println("payment done via UPI");
    }
}
