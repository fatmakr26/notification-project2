package com.example.notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationPublisher {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o) {
        observers.add(o);
    }

    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    public void notifyAllUsers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}

