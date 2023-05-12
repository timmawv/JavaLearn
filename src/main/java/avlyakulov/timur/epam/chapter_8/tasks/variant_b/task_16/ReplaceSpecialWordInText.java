package avlyakulov.timur.epam.chapter_8.tasks.variant_b.task_16;

import java.util.Scanner;

/*
В некотором предложении текста слова заданной длины заменить указанной подстрокой,
длина которой может не совпадать с длиной слова
 */
public class ReplaceSpecialWordInText {
    public static void main(String[] args) {
        String text = "word ankara car people live complicated";
        System.out.println("Введите слово, которым надо заменить слова предложения");
        String replaceWord = new Scanner(System.in).nextLine();
        System.out.println("Введите длину слова, чтобы заменить все слова с такой длиной");
        int length = new Scanner(System.in).nextInt();
        text = text.replaceAll(String.format("\\b\\w{%s}\\b",length),replaceWord);
        System.out.println(text);
    }
}