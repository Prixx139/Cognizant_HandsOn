package DesignPatterns.SingletonPatternDemo;
public class PatternTest {

    public static void main(String[] args) {

        ActivityLogger log1 = ActivityLogger.getInstance();
        ActivityLogger log2 = ActivityLogger.getInstance();

        log1.printLog("Application started");

        if (log1 == log2) {
            System.out.println("Both references point to same object.");
        }

    }
}
