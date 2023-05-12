package avlyakulov.timur.epam.chapter_11.example.stream;

import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<String> strings = List.of("as a the d ann ans anw on and and the".split("\\s+")); // сума длин строк 27
        int sum = strings.stream()
                .map(String::length)
                .reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(sum);

        //То же самое действие, но без промежуточного преобразования в stream целых чисел.
        sum = strings.stream()
                .reduce(0, (identity, v) -> v.length() + identity, (n1, n2) -> n1 + n2);
        System.out.println(sum);
    }
}