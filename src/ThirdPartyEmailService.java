package com.example.notification;

// Simulated legacy/third-party service
public class ThirdPartyEmailService {
    public void sendEmail(String content) {
        System.out.println("[ThirdPartyEmailService] " + content);
    }
}
