package br.com.refactoring.exercise5.model;

public class SmsChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
