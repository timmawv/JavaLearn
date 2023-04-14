package avlyakulov.timur.epam.chapter_12.example.flow_control;

import java.util.concurrent.TimeUnit;

public class JoinThread extends Thread {
    //задержка потока методом join()
    public void run() {
        System.out.println("Start");
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End");
    }
}