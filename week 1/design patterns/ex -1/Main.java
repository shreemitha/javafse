// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Fetch two logger instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use the logger
        logger1.log("First log message");
        logger2.log("Second log message");

        // Check if both logger instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances detected (Singleton failed).");
        }
    }
}
