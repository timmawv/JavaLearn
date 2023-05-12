package avlyakulov.timur.epam.chapter_12.example.lock.point;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PointLockMain {
    public static void main(String[] args) {
        PointManager pointManager = new PointManager();
        Random rand = new Random();
        ExecutorService service = Executors.newFixedThreadPool(15);
        Point point = new Point(1, -1);
        for (int i = 0; i < 15; ++i)
            service.submit(new PointThread(pointManager,point,rand.nextBoolean()));
        service.shutdown();
    }
}