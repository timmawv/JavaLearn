package avlyakulov.timur.epam.chapter_12.example.ex.executors.scheduled_executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new MyThread(), 3, TimeUnit.SECONDS); // пример запуска запланированого потока через какое то время
        scheduledExecutorService.shutdown();//ждет пока закончится поток и потом все отключается
    }
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}