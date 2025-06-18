package br.com.refactoring.exercise5.model;

public class EmailChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
