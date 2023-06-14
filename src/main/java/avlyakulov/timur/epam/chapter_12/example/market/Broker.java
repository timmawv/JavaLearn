package avlyakulov.timur.epam.chapter_12.example.market;

import java.util.concurrent.TimeUnit;

public class Broker extends Thread {
    private static Market market;
    private static final int PAUSE_IN_MILLIS = 500;

    public static void initMarket(Market market) {
        Broker.market = market;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(Thread.currentThread().getName() + " got that index : " + market.getIndex());
                TimeUnit.MILLISECONDS.sleep(PAUSE_IN_MILLIS);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
