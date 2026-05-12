package com.example.notification;

public class Phase0_BadNotificationService {
    public void send(String type, String message) {
        if(type.equals("email")) {
            System.out.println("Email: " + message);
        } else if(type.equals("sms")) {
            System.out.println("SMS: " + message);
        } else if(type.equals("push")) {
            System.out.println("Push: " + message);
        }
    }
}
