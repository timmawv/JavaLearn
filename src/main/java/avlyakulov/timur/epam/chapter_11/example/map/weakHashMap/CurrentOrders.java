package avlyakulov.timur.epam.chapter_11.example.map.weakHashMap;


import avlyakulov.timur.epam.chapter_11.example.arraylist.order.Order;

import java.util.WeakHashMap;

public class CurrentOrders {
    private WeakHashMap<Key, Order> orders = new WeakHashMap<>();

    public Order put(Key key, Order value) {
        return orders.put(key, value);
    }

    public Order get(Object key) {
        return orders.get(key);
    }

    public int size() {
        return orders.size();
    }

    public void printOrders() {
        orders.forEach((key, order) -> System.out.println(key + " " + order));
    }
}