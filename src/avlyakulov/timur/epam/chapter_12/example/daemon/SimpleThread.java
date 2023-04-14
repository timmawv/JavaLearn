package avlyakulov.timur.epam.chapter_12.example.daemon;

import java.util.concurrent.TimeUnit;

public class SimpleThread extends Thread {
    //запуск и выполнение потока-демона
    @Override
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("start of daemon thread");
                TimeUnit.MILLISECONDS.sleep(10);
            } else System.out.println("start of normal thread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (!isDaemon()) {
                System.out.println("Normal thread completion");
            } else System.out.println("daemon thread completion");
        }
    }
}