package avlyakulov.timur.epam.chapter_11.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//класс, агрегирующий список, с реализацией интерфейса Iterable  отношение с полем HAS-A
public class OrderTypeHAS implements Iterable<String> {
    private int orderId;
    private List<String> currencyNames = new ArrayList<>();

    public OrderTypeHAS(int orderId) {
        this.orderId = orderId;
    }
    public List<String> getCurrencyNames() {
        return List.copyOf(currencyNames);
    }
    // delegated method
    public boolean add(String e) {
        return currencyNames.add(e);
    }
    @Override
    public Iterator<String> iterator() {
        return currencyNames.iterator();
    }

    @Override
    public String toString() {
        return "OrderTypeHAS{" +
                "orderId=" + orderId +
                ", currencyNames=" + currencyNames +
                '}';
    }
}