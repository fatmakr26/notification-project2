package com.example.notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Push notification gönderildi: " + message);
    }
}

