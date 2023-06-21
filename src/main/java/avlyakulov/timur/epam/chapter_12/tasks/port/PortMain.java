package avlyakulov.timur.epam.chapter_12.tasks.port;

import java.util.concurrent.atomic.AtomicLong;

public class PortMain {
    public static void main(String[] args) {

        Port port = new Port(new AtomicLong(150));
        port.start();
        Ship.initPort(port);
        for (int i = 0; i < 5; ++i) {
            Ship ship = new Ship();
            ship.start();
        }
    }
}
