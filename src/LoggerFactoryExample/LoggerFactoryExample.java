package LoggerFactoryExample;

// Usage
public class LoggerFactoryExample {
    public static void main(String[] args) {
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.log("Error message to file");

        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        Logger consoleLogger = consoleLoggerFactory.createLogger();
        consoleLogger.log("Info message to console");
    }
}
