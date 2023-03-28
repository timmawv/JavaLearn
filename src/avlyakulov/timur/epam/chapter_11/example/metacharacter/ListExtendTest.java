package avlyakulov.timur.epam.chapter_11.example.metacharacter;

import avlyakulov.timur.epam.chapter_11.example.arraylist.order.Order;

import java.util.List;

public class ListExtendTest {


    //пример 2-х методов, в 1 невозможно добавить какие то эелементы, или что то сделать с нашим списком, та как мы не знаем,
    //что будет в передаваемом списке, та поэтому надо делать как во 2 варианте.
    //Поэтому добавление к спискам, параметризованным метасимволом с при-
    //менением extends, запрещено всегда.
    List<? extends Order> action(List<? extends Order> orders,int num) {
        //orders.add(new Order(231,12.f)); //compile error
        orders.remove(0);
        return null;
    }
    List<? super Order> action(List<? super Order> orders) {
        orders.add(new DiscountOrder(231, 12.f));
        return orders;
    }

    public static void main(String[] args) {
        //List<DiscountOrder> orders = new ListExtendTest().action(new ArrayList<DiscountOrder>());
    }
}

class DiscountOrder extends Order {
    public DiscountOrder(int orderId, float amount) {
        super(orderId, amount);
    }
}