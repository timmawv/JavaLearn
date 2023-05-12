package avlyakulov.timur.epam.chapter_11.example.map.weakHashMap;

import avlyakulov.timur.epam.chapter_11.example.arraylist.order.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CurrentOrdersMain {
    public static void main(String[] args) throws InterruptedException {
        CurrentOrders orders = new CurrentOrders();
        List<Key> keys = new ArrayList<>();
        keys.add(new Key(100));
        keys.add(new Key(220));
        keys.add(new Key(770));
        orders.put(keys.get(0), new Order(77, 10d));
        orders.put(keys.get(1), new Order(65, 54d));
        orders.put(keys.get(2), new Order(41, 93d));
        keys.get(1).setProcessed(true);
        Iterator<Key> iterator = keys.iterator();
        System.out.println(keys);
        while (iterator.hasNext()) {
            Key ordersKey = iterator.next();
            if (ordersKey.isProcessed())
                iterator.remove();
        }
        System.out.println(keys);
        orders.printOrders();
        System.out.println(orders.size());
        System.gc();
        Thread.sleep(1_000);
        System.out.println(orders.size());
        orders.printOrders();
    }
}