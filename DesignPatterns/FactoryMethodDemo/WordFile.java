package DesignPatterns.FactoryMethodDemo;

public class WordFile implements DocumentType {

    @Override
    public void openDocument() {
        System.out.println("Word document is opened.");
    }

}
