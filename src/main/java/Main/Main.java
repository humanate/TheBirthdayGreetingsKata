package Main;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(100);

        FileReader fileReader = new FileReader(queue);
        Thread producer = new Thread(fileReader);
        producer.start();

        UserFilter userFilter = new UserFilter(queue);
        Thread comsumer = new Thread(userFilter);
        comsumer.start();
    }
}
