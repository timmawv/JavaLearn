package avlyakulov.timur.epam.chapter_11.example.iterator;

import avlyakulov.timur.epam.chapter_11.example.arraylist.order.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
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
        Iterator<Order> iterator = orders.iterator();

        //example with find and delete special orders
        int controlAmount = 20;
        int discountPercent = 10;
        while (iterator.hasNext()) {
            Order current = iterator.next();
            if (current.getAmount() < controlAmount) {
                iterator.remove();
                continue;
            }
            current.setAmount(current.getAmount() * (100 - discountPercent) / 100.0);
        }
        System.out.println(orders);

    }
}
