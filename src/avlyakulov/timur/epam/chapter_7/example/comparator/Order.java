package avlyakulov.timur.epam.chapter_7.example.comparator;

import java.util.Comparator;

//класс-сущность с внутренними классами-компараторами
public class Order {
    private long orderId;
    private double amount;

    public double getAmount () {
        return amount;
    }
    public long getOrderId() {
        return orderId;
    }
    public static class IdComparator implements Comparator<Order> {
        public int compare (Order o1,Order o2) {
            return Long.compare(o1.orderId, o2.orderId);
        }
    }
    public static class AmountComparator implements Comparator<Order> {
        public int compare (Order o1,Order o2) {
            return Double.compare(o1.getAmount(),o2.getAmount());
        }
    }
    //example of creating comparator
    public static void main(String[] args) {
         Order.IdComparator comp = new Order.IdComparator();
    }
}