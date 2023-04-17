package avlyakulov.timur.epam.chapter_12.example.synchr;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SynchroMain {
    public static void main(String[] args) {
        try (CommonResource resource = new CommonResource("data/thread.txt")) {
            UseFileThread thread = new UseFileThread("First", resource);
            UseFileThread thread2 = new UseFileThread("Second", resource);
            thread2.start();
            thread.start();
            TimeUnit.SECONDS.sleep(5);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}