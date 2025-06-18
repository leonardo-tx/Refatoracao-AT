package br.com.refactoring.exercise6.model;

public class HtmlDocument implements Document {
    @Override
    public void print() {
        System.out.println("Printing HTML");
    }
}
