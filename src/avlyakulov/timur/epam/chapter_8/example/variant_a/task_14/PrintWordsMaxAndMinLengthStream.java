package avlyakulov.timur.epam.chapter_8.example.variant_a.task_14;

import java.util.Arrays;

public class PrintWordsMaxAndMinLengthStream {
    public static void main(String[] args) {
        String text = "Наши слова на крылышки вот такие крутые так что да они то очень крутые крутышки";
        int maxLength = Arrays.stream(text.split("\\s"))
                .max((w1, w2) -> w1.length() - w2.length())
                .orElse(null).length();
        int minLength = Arrays.stream(text.split("\\s"))
                .max((w1, w2) -> w2.length() - w1.length())
                .orElse(null).length();
        System.out.println("Слова максимальной длинны");
        Arrays.stream(text.split("\\s"))
                .filter(s -> s.length() == maxLength)
                .forEach(System.out::println);
        System.out.println("Слова минимальной длинны");
        Arrays.stream(text.split("\\s"))
                .filter(s -> s.length() == minLength)
                .forEach(System.out::println);
    }
}