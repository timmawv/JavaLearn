package avlyakulov.timur.epam.chapter_11.example.set;

import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("5Y");
        hashSet.add("Y-");
        hashSet.add("8Y");
        hashSet.add("2Y");
        hashSet.add("2Y");
        hashSet.add("8Y");
        hashSet.add("6Y");
        hashSet.stream()
                .peek(System.out::print)
                .forEach(s -> System.out.println(" " + s.hashCode()));
    }
}