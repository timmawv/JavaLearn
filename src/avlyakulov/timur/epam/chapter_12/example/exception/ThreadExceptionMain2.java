package avlyakulov.timur.epam.chapter_12.example.exception;

import java.util.concurrent.TimeUnit;

public class ThreadExceptionMain2 {
    //генерация исключения в потоке main
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End of Thread");
        }).start();
        try {
            TimeUnit.MILLISECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (Boolean.TRUE) {
            throw new RuntimeException();
        }
        System.out.println("end of main thread");
    }
}