package br.com.refactoring.exercise6.model;

public class PdfDocument implements Document {
    @Override
    public void print() {
        System.out.println("Printing PDF");
    }
}
