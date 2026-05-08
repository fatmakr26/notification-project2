package com.example.notification;

public class Main {
    public static void main(String[] args) {

        NotificationFacade facade = new NotificationFacade();
        facade.send("email", "Hello Email!");
        facade.send("sms", "Hello SMS!");

        Notification adapter = new EmailAdapter(new ThirdPartyEmailService());
        adapter.send("Adapter email message");
    }
}
