package avlyakulov.timur.epam.chapter_7.strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Написать предикат, выбирающий имена, которые начинаются с заданной буквы.
 */
public class CheckLetter {
    public static void main(String[] args) {
        String[] names = {"Timur", "Dima", "Tolik", "Danya", "Oleg", "Tina", "Tanya", "Katya"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter");
        String letter = sc.nextLine().toUpperCase();
        Predicate<String> checkNameStart = str -> str.startsWith(letter);
        System.out.println(Arrays.stream(names).filter(checkNameStart).collect(Collectors.toList()));
        sc.close();

    }
}