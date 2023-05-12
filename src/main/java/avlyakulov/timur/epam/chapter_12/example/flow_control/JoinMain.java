package avlyakulov.timur.epam.chapter_12.example.flow_control;

import java.util.concurrent.TimeUnit;

public class JoinMain {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Start 1");
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End 1");
        }).start();
        JoinThread thread = new JoinThread();
        thread.start();
        try {
            thread.join(100);// ждем пока закончит роботу побочнный поток и после этого выполнение продолжит главный поток в нашем случае main()
            //Thread.currentThread().join(100);// побочный поток
            // or //TimeUnit.MILLISECONDS.timedJoin(thread,100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end of " + Thread.currentThread().getName());
    }
}