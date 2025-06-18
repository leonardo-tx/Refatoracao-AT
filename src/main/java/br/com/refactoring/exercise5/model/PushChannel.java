package br.com.refactoring.exercise5.model;

public class PushChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}
