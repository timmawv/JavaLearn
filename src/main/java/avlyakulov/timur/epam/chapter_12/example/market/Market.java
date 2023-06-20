package avlyakulov.timur.epam.chapter_12.example.market;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Market extends Thread {
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
        while (true) {
            synchronized (this) {
                index.addAndGet(generator.nextInt(21) - 10);
                System.out.println("Market set that index for brokers " + getIndex());
                notifyAll();
            }
            try {
                sleep(3_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}