package Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.BlockingQueue;

public class FileUtil {
    public static boolean getEmployeeDataFromFile(String fileName, BlockingQueue<String> queue) throws Exception {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            while (true) {
                String employeeData = bufferedReader.readLine();
                if (employeeData == null) {
                    return true;
                }
                queue.put(employeeData);
            }
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
    }
}
