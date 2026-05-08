package com.example.notification;

public class Main {
    public static void main(String[] args) {

        // ===== Facade =====
        NotificationFacade facade = new NotificationFacade();
        facade.send("email", "Hello Email!");
        facade.send("sms", "Hello SMS!");

        // ===== Adapter =====
        Notification adapter = new EmailAdapter(new ThirdPartyEmailService());
        adapter.send("Adapter email message");
    }
}
