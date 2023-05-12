package avlyakulov.timur.epam.chapter_11.example.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UncheckMain {
    public static void main(String[] args) {
        List raw = List.of(new Order(231, 12),
                new ArrayList(),
                new Order(217, 13),
                "Toilet");
        //now to get elements we need use type casting
        Order order = (Order) raw.get(0);
        List order1 = (ArrayList) raw.get(1);
        Order order2 = (Order) raw.get(2);
        String order3 = (String) raw.get(3);
        raw.forEach(System.out::println);
        List<Order> orders = List.of(new Order(231, 12),
                //new ArrayList(), compile error
                new Order(217, 13));
                //"Toilet") compile error
        orders.forEach(System.out::println);

    }
}

class Order {
    int id;
    int price;

    public Order(int id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + id +
                ", amount=" + price +
                '}';
    }
}