package avlyakulov.timur.epam.chapter_12.tasks.port;

import java.util.Random;

public class Ship extends Thread {
    static Port port;
    int maxNumberContainer;
    int currentNumberContainer;
    Random random = new Random();

    public Ship() {
        maxNumberContainer = random.nextInt(15, 30);
        currentNumberContainer = random.nextInt(5, 8);
        System.out.printf("Ship was created with this parameter:\nMax number container - %d\nCurrent number container - %d", maxNumberContainer, currentNumberContainer);
    }

    @Override
    public void run() {

    }
}