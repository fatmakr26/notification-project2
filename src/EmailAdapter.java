package com.example.notification;

public class EmailAdapter implements Notification {
    private ThirdPartyEmailService service;

    public EmailAdapter(ThirdPartyEmailService service) {
        this.service = service;
    }

    @Override
    public void send(String message) {
        service.sendEmail(message);
    }
} 

