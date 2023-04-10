package avlyakulov.timur.practise.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Order> orders = List.of(new Order(1, 50), new Order(5, 70),
                new Order(7, 50));
        orders.stream()
                .collect(Collectors.groupingBy(Order::amount))
                .forEach((source, r) -> System.out.print(source + " "));
        System.out.println(70 > 70);
    }
}

record Order(long orderId, double amount) {

}