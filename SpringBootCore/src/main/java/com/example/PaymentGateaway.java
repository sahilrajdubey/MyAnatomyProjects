package com.example;


import org.springframework.stereotype.Component;

@Component 
public class PaymentGateaway {

    private PaymentProperties paymentProperties;

    public PaymentGateaway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }
    public String getType() {
        return paymentProperties.getType();
    }
    public int getRetryCount() {
        return paymentProperties.getRetryCount();
    }
    public boolean isIsenabled() {
        return paymentProperties.isIsenabled();
    }
    public int getTimeout() {
        return paymentProperties.getTimeout();
    }
    public void printPaymentProperties() {
        System.out.println("Payment Properties Type: " + paymentProperties.getType());
        System.out.println("Payment Properties Retry Count: " + paymentProperties.getRetryCount());
        System.out.println("Payment Properties Is Enabled: " + paymentProperties.isIsenabled());
        System.out.println("Payment Properties Timeout: " + paymentProperties.getTimeout());
    }

}
