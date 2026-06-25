package DesignPatterns.SingletonPatternDemo;
public class ActivityLogger {

    private static ActivityLogger currentLogger;

    private ActivityLogger() {

    }

    public static ActivityLogger getInstance() {

        if (currentLogger == null) {
            currentLogger = new ActivityLogger();
        }

        return currentLogger;
    }

    public void printLog(String text) {
        System.out.println("Log Message : " + text);
    }

}
