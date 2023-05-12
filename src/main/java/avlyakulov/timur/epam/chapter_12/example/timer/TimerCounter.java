package avlyakulov.timur.epam.chapter_12.example.timer;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class TimerCounter extends TimerTask {
    //поток, запускаемый через определенный промежуток времени
    private static int i;

    @Override
    public void run() {
        System.out.println(++i);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\t" + i);
    }
}
