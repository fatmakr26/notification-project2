package com.example.notification;

public class NotificationContext {
    private SendStrategy strategy;

    public NotificationContext(SendStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SendStrategy strategy) {
        this.strategy = strategy;
    }

    public void send(Notification notification, String message) {
        strategy.execute(notification, message);
    }
}

