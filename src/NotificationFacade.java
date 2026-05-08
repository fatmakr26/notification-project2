package com.example.notification;

public class NotificationFacade {
    public void send(String type, String message) {
        Notification n = NotificationFactory.create(type);
        n.send(message);
    }
}
