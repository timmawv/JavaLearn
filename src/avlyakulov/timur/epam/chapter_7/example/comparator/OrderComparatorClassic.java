package avlyakulov.timur.epam.chapter_7.example.comparator;

import java.util.Comparator;

public enum OrderComparatorClassic implements Comparator<Order> {
    ID {
        @Override
        public int compare (Order o1,Order o2) {
            return Long.compare(o1.getOrderId(),o2.getOrderId());
        }
    },
    AMOUNT {
        @Override
        public int compare (Order o1,Order o2) {
            return Double.compare(o1.getAmount(),o2.getAmount());
        }
    }
}
