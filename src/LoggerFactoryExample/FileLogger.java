package LoggerFactoryExample;
public class FileLogger implements Logger {

    @Override
    public void log(String message) {
     System.out.println("Logging to file: " + message);
    
    }
    
}