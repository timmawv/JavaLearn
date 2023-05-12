package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_11;

import java.util.Arrays;

/*
Найти, каких букв, гласных или согласных, больше в каждом предложении
текста.
 */
public class FindMoreLetters {
    public static void main(String[] args) {
        String text = "Our text is very interesting to read.So what do you want to know.It is amazing!How many people are here?";
        String[] sentences = text.split("[.?!]");
        System.out.println(Arrays.toString(sentences));
        int counterConsonants = 0;
        for (String sen : sentences) {
            char[] senChar = sen.replace(" ", "").toLowerCase().toCharArray();
            for (char ch : senChar)
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ++counterConsonants;
                }
            if (counterConsonants > senChar.length - counterConsonants)
                System.out.println("Гласных больше и их количество: " + counterConsonants);
            else System.out.println("Согласных больше и их количество: " + (senChar.length - counterConsonants));
            counterConsonants = 0;
        }
    }
}