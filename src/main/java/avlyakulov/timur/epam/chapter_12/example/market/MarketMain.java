package avlyakulov.timur.epam.chapter_12.example.market;

import java.util.concurrent.atomic.AtomicLong;

public class MarketMain {
    private static final int NUMBER_BROKERS = 5;

    public static void main(String[] args) {
        Market market = new Market(new AtomicLong(100));
        Broker.initMarket(market);
        market.start();

            Broker broker = new Broker();
            //broker.setName("Broker" + i);
            broker.start();


    }
}
