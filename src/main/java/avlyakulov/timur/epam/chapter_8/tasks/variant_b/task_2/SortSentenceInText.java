package avlyakulov.timur.epam.chapter_8.tasks.variant_b.task_2;

import java.util.Arrays;

//Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
public class SortSentenceInText {
    public static void main(String[] args) {
        String text = "Наше первое предложение, было написано вчера вечером. Наше второе предложение, очень хорошее. Наше третье предложение есть";
        Arrays.stream(text.replaceAll("\\.\\s",".").split("\\.")).sorted((s1,s2) -> s1.length() - s2.length()).forEach(System.out::println);
    }
}