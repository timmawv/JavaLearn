package avlyakulov.timur.epam.chapter_11.example.stream;

import avlyakulov.timur.epam.chapter_11.example.iterator.OrderTypeHAS;

import java.util.List;

public class ListTransformation {
    public static void main(String[] args) {
        OrderTypeHAS type = new OrderTypeHAS(12);
        type.add("SEK");
        type.add("DKK");
        type.add("NOK");
        type.add("EUR");
        OrderTypeHAS type2 = new OrderTypeHAS(20);
        type2.add("SEK");
        type2.add("PLN");
        type2.add("CZK");
        type2.add("EUR");
        System.out.println(type.getCurrencyNames());
        System.out.println(type2.getCurrencyNames());
        List<OrderTypeHAS> orderTypes = List.of(type, type2);
        System.out.println(orderTypes);
        List<String> currencyListOfStrings = orderTypes.stream()
                .map(OrderTypeHAS::getCurrencyNames)
                .flatMap(List::stream)
                .toList();
        System.out.println(currencyListOfStrings);

    }
}
