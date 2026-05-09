package com.example.notification;

public class DelayedSendStrategy implements SendStrategy {
    @Override
    public void execute(Notification notification, String message) {
        try {
            Thread.sleep(500); // simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        notification.send("[DELAYED] " + message);
    }
}
