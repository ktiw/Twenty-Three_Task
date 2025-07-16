import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public void writeActionLog(String filePath, String logEntry)  {
        try {
            BufferedWriter buff = new BufferedWriter(new FileWriter(filePath, true));
            buff.write(logEntry);
            buff.newLine();
            buff.close();
        } catch (IOException e) {
            System.err.println("Ошибка! файл не найден!" + filePath + ": " + e.getMessage());
        }

    }
}
