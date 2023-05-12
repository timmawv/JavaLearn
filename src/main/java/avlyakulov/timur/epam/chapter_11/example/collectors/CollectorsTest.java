package avlyakulov.timur.epam.chapter_11.example.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest {
    public static void main(String[] args) {
        List<String> strings = List.of("as a the d ann ans anw on and and the".split("\\s+"));
        //toCollection(Supplier<C> collectionFactory), toList(), toSet() — преобразование в коллекцию;
        List<Integer> listLengths = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(listLengths);

        //Преобразование в список с применением ссылки на конструктор:
        List<Character> listFirstSymb = strings.stream()
                .map(s -> s.charAt(0))
                .collect(Collectors.toCollection(ArrayList::new)); // здесь мы создали list на основе ArrayList и методы нашего list теперь имеют его реализацию
        System.out.println(listFirstSymb);

        // convert strings to upperCase and concatenate them, separated by colon
        //joining(CharSequence delimiter) — обеспечивает конкатенацию строк с заданным разделителем;
        String result = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" : "));
        System.out.println(result);
        String res = String.join(" : ", " klasdjf", "jaksldfjaslfkj", "Kyundya", "Loh");
        System.out.println(res);

        //mapping(Function<? super T,? extends U> mapper,Collector<? super U,A,R> downstream) —
        // позволяет преобразовать элементы одного типа в элементы другого типа;
        // converting a list of strings to a list of codes of their first characters

        List<Integer> listCode = strings.stream()
                .collect(Collectors.mapping(s -> (int) s.charAt(0), Collectors.toList()));
        System.out.println(listCode);

        // converting a list of strings to a list of codes of their first characters and
        // finding the maximum value
        int max = strings.stream()
                .collect(Collectors.mapping(s -> (int) s.charAt(0),
                        Collectors.maxBy(Integer::compareTo))).orElse(-1);
        System.out.println(max);


        //averagingInt(ToIntFunction<? super T> mapper) — вычисляет среднее
        //арифметическое элементов потока. Существуют версии для Long и Double;
        double average = strings.stream()
                .collect(Collectors.averagingDouble(String::length));
        System.out.println(average);
        /* reducing(T identity, BinaryOperator<T> op) — коллектор, осуществляющий редукцию (сведение)
         элементов на основании заданного бинарного оператора; */
        // compute sum of code first chars each strings
        int sumOfLength = strings.stream()
                .map(String::length)
                .collect(Collectors.reducing(0, (n1, n2) -> n1 + n2));
        System.out.println(sumOfLength);

        //тот же пример но без промежуточного получения Stream<Integer> lengthOfStrings;
        sumOfLength = strings.stream()
                .collect(Collectors.reducing(1, s -> s.length(), (s1, s2) -> s1 + s2));
        System.out.println("Наш результат тоолько на 1 больше " + sumOfLength);
    }
}