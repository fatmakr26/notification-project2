package com.example.notification;

public class Main {
    public static void main(String[] args) {

        Notification notif = NotificationFactory.create("push");

        NotificationContext context = new NotificationContext(new InstantSendStrategy());
        context.send(notif, "Instant message");

        context.setStrategy(new DelayedSendStrategy());
        context.send(notif, "Delayed message");

        NotificationPublisher publisher = new NotificationPublisher();

        publisher.subscribe(new User("Fatma"));
        publisher.subscribe(new User("Sevil"));

        publisher.notifyAllUsers("New campaign!");
    }
}
