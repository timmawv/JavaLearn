package avlyakulov.timur.epam.chapter_8.example.regular_expression;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PatternStreamMain {
    public static void main(String[] args) {
        String[] arrayStr = {"12.9", "44", "the", "7,1", "27..2", "211"};
        List<Integer> list = Arrays.stream(arrayStr)
                .flatMap(Pattern.compile("\\D+")::splitAsStream)
                .peek(s -> System.out.print(s + " "))
                .filter(Pattern.compile("[2-9]+").asPredicate())
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println(list);
    }
}
