package avlyakulov.timur.epam.chapter_12.tasks.port;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Ship extends Thread {
    static Port port;
    int maxNumberContainer;
    int currentNumberContainer;
    Random random = new Random();

    public Ship() {
        maxNumberContainer = random.nextInt(15, 20);
        currentNumberContainer = random.nextInt(5, 14);
        System.out.printf("Ship was created with %d cur and max %d cont\n", currentNumberContainer, maxNumberContainer);
    }

    public static void initPort(Port port) {
        Ship.port = port;
    }

    public void setNumberContainer(int currentNumberContainer) {
        this.currentNumberContainer = currentNumberContainer;
    }

    public void loadContainersToShip() {
        boolean check = false;
        while (!check) {
            int containers = random.nextInt(6, 8);
            int afterLoad = containers + currentNumberContainer;
            if (afterLoad > maxNumberContainer) {
                int differenceContainer = afterLoad - maxNumberContainer + 3;
                currentNumberContainer -= differenceContainer;
                AtomicLong cont = new AtomicLong(port.getNumberContainer().addAndGet(differenceContainer));
                port.setContainers(cont);
                System.out.println("The ship was unloaded at the moment it has " + currentNumberContainer + " containers");
                System.out.println("The port has " + port.getNumberContainer() + " containers");

            } else {
                currentNumberContainer += containers;
                AtomicLong cont = new AtomicLong(port.getNumberContainer().addAndGet(-containers));
                port.setContainers(cont);
                System.out.println("The ship was loaded at the moment it has " + currentNumberContainer + " containers");
                System.out.println("The port has " + port.getNumberContainer() + " containers");
                check = true;
            }
        }
    }

    @Override
    public void run() {
        synchronized (port) {
            loadContainersToShip();
            port.notify();
        }
    }
}