package com.example.notification;

public class Main {
    public static void main(String[] args) {

        Notification n1 = NotificationFactory.create("email");
        n1.send("Hello Email!");

        Notification n2 = NotificationFactory.create("sms");
        n2.send("Hello SMS!");

        Notification n3 = NotificationFactory.create("push");
        n3.send("Hello Push!");
    }
}
