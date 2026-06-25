package DesignPatterns.FactoryMethodDemo;

public class WordCreator extends DocCreator {

    @Override
    public DocumentType createFile() {
        return new WordFile();
    }

}
