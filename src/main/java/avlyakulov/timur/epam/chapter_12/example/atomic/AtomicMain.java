package avlyakulov.timur.epam.chapter_12.example.atomic;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicMain {
    //запуск потоков изменения атомарного поля
    //и его отслеживаниянесколькими потоками
    private static final int NUMBER_BROKERS = 30;

    public static void main(String[] args) {
        Market market = new Market(new AtomicLong(100));
        Broker.initMarket(market);
        market.start();
        for (int i = 0; i < NUMBER_BROKERS; ++i)
            new Broker().start();
    }
}