public class Logger {

    // Step 2a: private static instance of Logger
    private static Logger instance;

    // Step 2b: private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Step 2c: public static method to return the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // lazy initialization
        }
        return instance;
    }

    // A sample log method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
