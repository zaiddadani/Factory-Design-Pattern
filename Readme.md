# Factory Design Pattern

The Factory Design Pattern falls under the category of creational design patterns and provides an interface for creating objects in a super class, but allows subclasses to alter the type of objects that will be created. In other words, it delegates the responsibility of instantiating objects to its subclasses.

## Key Components

1. **Factory Interface/Class:**
   - Declares the factory method, which returns an object of a type specified by an interface or abstract class.

2. **Concrete Factories:**
   - Classes that implement the factory interface and create specific types of objects.

3. **Product Interface/Class:**
   - Defines the interface of the objects the factory method creates.

4. **Concrete Products:**
   - Classes that implement the product interface and are created by the factory method.

---

## Simple Example Implementation To Understand Factory Design Pattern

```java
// Product interface
public interface Logger {
    void log(String message);
}

// Concrete Products
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logging to file: " + message);
    }
}

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logging to console: " + message);
    }
}

// Factory interface
public interface LoggerFactory {
    Logger createLogger();
}

// Concrete Factories
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}

public class ConsoleLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}

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
