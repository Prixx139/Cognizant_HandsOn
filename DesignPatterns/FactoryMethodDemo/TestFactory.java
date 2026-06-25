package DesignPatterns.FactoryMethodDemo;

public class TestFactory {

    public static void main(String[] args) {

        DocCreator pdfObj = new PdfCreator();
        DocumentType pdfDoc = pdfObj.createFile();
        pdfDoc.openDocument();

        DocCreator wordObj = new WordCreator();
        DocumentType wordDoc = wordObj.createFile();
        wordDoc.openDocument();

    }

}
