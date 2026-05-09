package com.example.notification;

public interface SendStrategy {
    void execute(Notification notification, String message);
}
