package DesignPatterns.FactoryMethodDemo;

public class PdfFile implements DocumentType {

    @Override
    public void openDocument() {
        System.out.println("PDF document is opened.");
    }

}
