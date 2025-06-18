package br.com.refactoring.exercise6.model;

public class CsvDocument implements Document {
    @Override
    public void print() {
        System.out.println("Printing CSV");
    }
}
