package avlyakulov.timur.epam.chapter_11.example.iterator;

import avlyakulov.timur.epam.chapter_11.example.arraylist.order.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMainWithStreams {
    public static void main(String[] args) {
        int controlAmount = 20;
        int discountPercent = 10;
        List<Order> orders = new ArrayList<>() {
            {
                add(new Order(231, 12.));
                add(new Order(389, 29.));
                add(new Order(747, 32.));
                add(new Order(517, 18.));
                add(new Order(414, 17.));
                add(new Order(777, 10.));
            }
        };
        //example with functional interfaces
        orders.removeIf(o -> o.getAmount() <= controlAmount);
        orders.forEach(o -> o.setAmount(o.getAmount() * (100 - discountPercent)/100.0));
        orders.forEach(System.out::println);
    }
}
