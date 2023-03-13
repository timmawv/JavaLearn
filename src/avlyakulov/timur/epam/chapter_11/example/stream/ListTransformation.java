package avlyakulov.timur.epam.chapter_11.example.stream;

import avlyakulov.timur.epam.chapter_11.example.iterator.OrderTypeHAS;
import avlyakulov.timur.epam.chapter_11.example.iterator.OrderTypeIS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<OrderTypeHAS> orderTypes = List.of(type, type2);
        List<String> currencyList = orderTypes.stream()
                .map(o -> o.getCurrencyNames()) // -> Stream <List<String>>
                .flatMap(o -> o.stream())// -> Stream <String>
                .collect(Collectors.toList());
        System.out.println(currencyList);


    }
}
