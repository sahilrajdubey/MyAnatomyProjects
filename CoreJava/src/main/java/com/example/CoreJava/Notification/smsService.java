package com.example.CoreJava.Notification;

public class smsService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("SMS sent");
    }
    
}
