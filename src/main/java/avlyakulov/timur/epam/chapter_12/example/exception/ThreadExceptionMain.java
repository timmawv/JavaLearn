package avlyakulov.timur.epam.chapter_12.example.exception;

import java.util.concurrent.TimeUnit;

public class ThreadExceptionMain {
    //генерация исключения в созданном потоке
    public static void main(String[] args) {
        new Thread(() -> {
            if (Boolean.TRUE) {
                throw new RuntimeException();
            }
            System.out.println("end of Thread");
        }).start();
        try{
            TimeUnit.MILLISECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of main thread");
    }
}