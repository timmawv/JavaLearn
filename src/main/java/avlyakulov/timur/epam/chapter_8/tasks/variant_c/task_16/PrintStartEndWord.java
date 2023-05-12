package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_16;
/*
В тексте нет слов, начинающихся одинаковыми буквами. Напечатать слова
текста в таком порядке, чтобы последняя буква каждого слова совпадала
с первой буквой следующего слова. Если все слова нельзя напечатать в таком
порядке, найти такую цепочку, состоящую из наибольшего количества слов.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//todo доделать цепочку поиска для всех слов, не только для какого то конкретного
public class PrintStartEndWord {
    public static void main(String[] args) {
        String text = "армия ярмарка зуй саня одиссей йога";
        String[] words = text.split("\\s");
        List<String> chain = new ArrayList<>();
        List<List> chainList = new ArrayList<>();
        System.out.println(Arrays.toString(words));
        int counter = 0;
        while (counter < words.length) {
            String word = words[counter];
            chain.add(word);
            for (int i = 0; i < words.length; ++i) {
                for (int j = 0; j < words.length; ++j) {
                    if (!chain.contains(words[j]) && !word.equals(words[j]) && word.charAt(word.length() - 1) == words[j].charAt(0)) {
                        word = words[j];
                        chain.add(word);
                    }
                }
            }
            chainList.add(chain);
            ++counter;
        }
        for (List l : chainList)
            System.out.println(l);
    }
}