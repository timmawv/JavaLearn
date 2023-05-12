package avlyakulov.timur.epam.chapter_7.example.reference;

import avlyakulov.timur.epam.chapter_7.example.comparator.Order;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ReferenceTest {
    public static void main(String[] args) {
        //функция задана для получения индетификатора в виде лямбда
        Function<Order,Long> function = o -> o.getOrderId();
        //то можно записать ее в виде ссылки на метод:
        function = Order::getOrderId;
        //пример на Consumer
        Consumer<String> consumer = s -> System.out.println(s);
        //теперь запишем более компактно, они абсолютно одинаковые
        consumer = System.out::println;
        //для статических методов возможно представление
        BiFunction<Double,Double,Double> biFunction = Math::hypot;
        //что эквивалентно
        biFunction = (x,y) -> Math.hypot(x,y);


        //ссылка на нестатический метод объекта конкретного типа
        Comparator<Long> comparator = (l1,l2) -> l1.compareTo(l2);
        //теперь более короткая запись нашего примера
        comparator = Long::compareTo;//awesome

        //также ссылки могу указывать на конструктор
        Supplier<StringBuilder> supplier = StringBuilder::new;


    }
}
