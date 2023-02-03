package avlyakulov.timur.practise;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        String word1 = "са";
        System.out.println(word1.matches("[а-я]{3,}"));

        String[] words = {"word", "wor", "wo", "w", "words"};
        System.out.println(Arrays.toString(words));
        for (String w : words) {
            if (!w.matches("[a-z]{3,}")) {
                System.out.println("All is working");
                continue;
            } else {
                System.out.println("No it is not working");
            }
            System.out.println("Working...");
        }
    }
}