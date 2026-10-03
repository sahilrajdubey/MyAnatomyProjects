package com.example.CoreJava.Notification;

public class emailService implements NotificationService {

    @Override 
    public void sendNotification() {
        System.out.println("email sent");
    }
}
