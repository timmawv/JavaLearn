package avlyakulov.timur.epam.chapter_11;

import avlyakulov.timur.epam.chapter_11.variant_b.task_1.RoundOfPeople;

public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        long millis = System.currentTimeMillis();
        new RoundOfPeople().removeThePersonFromTheCircleArrayList();
        System.out.println("Time of deleting " + (System.currentTimeMillis() - millis));
    }
}