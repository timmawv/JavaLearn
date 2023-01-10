package avlyakulov.timur.epam.chapter_7.example.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorOwnTest {
    public static void main(String[] args) {
        Comparator<String> comparator = (s1,s2) -> s2.length() - s1.length();
        String[] arrStr = {"thousand","car","is","book","ice"};
        Arrays.stream(arrStr).sorted(comparator).forEach( s -> System.out.println(s));
    }
}
