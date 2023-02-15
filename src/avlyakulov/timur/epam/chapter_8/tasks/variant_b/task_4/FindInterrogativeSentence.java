package avlyakulov.timur.epam.chapter_8.tasks.variant_b.task_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины.
public class FindInterrogativeSentence {
    public static void main(String[] args) {
        String text = "Наше первое предложение, было написано вчера вечером. Наше второе предложение вчера вечером есть очень хорошее? Наше третье было предложение есть?";
        System.out.println("Введите слово длину слова которую хотите найти");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Pattern pattern = Pattern.compile("[A-ZА-Я][^.!?]*\\?");
        Matcher matcher = pattern.matcher(text);
        String[] words;
        String word = "";
        while (matcher.find()) {
            word += matcher.group();
        }
        words = word.split("[\\s?]");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.stream(words).distinct().toList());
        System.out.println("Слова искомой длинны без повторений");
        Arrays.stream(words).distinct().filter(s -> s.length() == length).forEach(s -> System.out.print(s + ", "));
    }
}