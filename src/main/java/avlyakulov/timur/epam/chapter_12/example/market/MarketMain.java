package avlyakulov.timur.epam.chapter_12.example.market;

import java.util.concurrent.atomic.AtomicLong;

public class MarketMain {
    private static final int NUMBER_BROKERS = 3;

    public static void main(String[] args) {
        Market market = new Market(new AtomicLong(100));
        Broker.initMarket(market);
        market.start();
        for (int i = 0; i < NUMBER_BROKERS; ++i) {
            Broker broker = new Broker();
            broker.setName("Broker" + (i  + 1));
            broker.start();
        }
    }
}