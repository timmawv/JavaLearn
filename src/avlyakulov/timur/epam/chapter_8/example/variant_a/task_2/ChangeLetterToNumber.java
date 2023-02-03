package avlyakulov.timur.epam.chapter_8.example.variant_a.task_2;

import java.util.Arrays;

/*
В тексте каждую букву заменить ее порядковым номером в алфавите. При
выводе в одной строке печатать текст с двумя пробелами между буквами,
в следующей строке внизу под каждой буквой печатать ее номер.
 */
public class ChangeLetterToNumber {
    public static void main(String[] args) {
        String text = "аб вг а , ю а й я";
        char[] wordsChar = text.replaceAll("[\\s,]","").toLowerCase().toCharArray();
        int[] serialNumberInAlphabet = new int[wordsChar.length];
        int counter = 0;
        for (char c : wordsChar) {
            serialNumberInAlphabet[counter] = c - 'а' + 1;
            ++counter;
        }
        System.out.println(text);
        System.out.println(Arrays.toString(serialNumberInAlphabet));
    }
}