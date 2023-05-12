package avlyakulov.timur.epam.chapter_12.example.atomic;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Market extends Thread {
    // класс с атомарным полем
    private AtomicLong index;
    private Random generator = new Random();

    public Market(AtomicLong index) {
        this.index = index;
    }

    public AtomicLong getIndex() {
        return index;
    }

    @Override
    public void run() {
        try {
            while (true) {
                index.addAndGet(generator.nextInt(21) - 10);
                Thread.sleep(generator.nextInt(500));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
