package com.example.notification;

public class InstantSendStrategy implements SendStrategy {
    @Override
    public void execute(Notification notification, String message) {
        notification.send(message);
    }
}
