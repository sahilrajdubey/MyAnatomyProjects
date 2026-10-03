package com.example.CoreJava.Notification;

public class popUpService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("pop up sent");
    }
    
}
