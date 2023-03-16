package avlyakulov.timur.epam.chapter_11.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest2 {

    public static void main(String[] args) {
        List<String> strings = List.of("as a the d ann ans anw on and and the".split("\\s+"));

        //<R, A> R collect(Collector<? super T, A, R> collector) — собирает элементы в коллекцию или объект другого типа;
        // по сути простой пример преобразование в другой тип коллекции
        Map<String, Integer> map = Arrays.stream("as a the d on and".split("\\s+"))
                .collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(map);

        //пример работы оператора min()
        String min = strings.stream()
                .min(Comparator.comparingInt(s -> s.charAt(s.length() - 1)))
                .orElse("none");
        System.out.println(min);

        //пример работы max()
        String max = strings.stream()
                .max((s1, s2) -> s1.length() - s2.length())
                .orElse("empty");
        System.out.println(max);

    }
}