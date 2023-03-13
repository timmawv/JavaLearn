package avlyakulov.timur.epam.chapter_11.example.iterator;

import java.util.ArrayList;

//отношение с полем IS-A
public class OrderTypeIS extends ArrayList<String> {
    private int orderId;

    public OrderTypeIS(int orderId) {
        this.orderId = orderId;
    }


    public static void main(String[] args) {
        OrderTypeIS orderTypeIS = new OrderTypeIS(12);
        orderTypeIS.add("ord");
        System.out.println(orderTypeIS);
    }
}