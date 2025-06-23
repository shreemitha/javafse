// File: Logger.java
public class Logger {
    // Step 1: Create a private static instance of Logger
    private static Logger instance;

    // Step 2: Make the constructor private
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // lazy initialization
        }
        return instance;
    }

    // Logger functionality
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
