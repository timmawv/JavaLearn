package avlyakulov.timur.epam.chapter_11.example.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleWithPeek {
    public static void main(String[] args) {
        List<String> strings = List.of("as a the d on and".split("\\s+"));
        strings.stream()
                .peek(System.out::println)  // не прерывает наш поток а просто продолжает его позволяет взглянуть как идут действия
                .map(String::length)
                .forEach(System.out::println); // прерывает его и уже ничего нельзя сделать с нашим потоком


    }
}
