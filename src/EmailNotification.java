package com.example.notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email gönderildi: " + message);
    }
}

