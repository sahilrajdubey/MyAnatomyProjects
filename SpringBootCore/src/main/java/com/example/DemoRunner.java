package com.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements ApplicationRunner {

    private PaymentGateaway paymentGateaway;

    public DemoRunner(PaymentGateaway paymentGateaway) {
        this.paymentGateaway = paymentGateaway;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        paymentGateaway.printPaymentProperties();
    }
    
}
