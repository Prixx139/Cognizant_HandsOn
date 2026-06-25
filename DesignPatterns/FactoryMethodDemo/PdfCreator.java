package DesignPatterns.FactoryMethodDemo;

public class PdfCreator extends DocCreator {

    @Override
    public DocumentType createFile() {
        return new PdfFile();
    }

}
