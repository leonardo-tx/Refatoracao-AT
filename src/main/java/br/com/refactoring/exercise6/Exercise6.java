package br.com.refactoring.exercise6;

import br.com.refactoring.exercise6.model.CsvDocument;
import br.com.refactoring.exercise6.model.Document;
import br.com.refactoring.exercise6.model.HtmlDocument;
import br.com.refactoring.exercise6.model.PdfDocument;

public class Exercise6 {
    public static void main(String[] args) {
        printDocument(new HtmlDocument());
        printDocument(new PdfDocument());
        printDocument(new CsvDocument());
    }

    private static void printDocument(Document document) {
        document.print();
    }
}
