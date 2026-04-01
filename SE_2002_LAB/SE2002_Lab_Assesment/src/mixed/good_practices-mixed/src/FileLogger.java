import java.io.FileWriter;

public class FileLogger implements LoggerService {

    public void log(String message) {
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
