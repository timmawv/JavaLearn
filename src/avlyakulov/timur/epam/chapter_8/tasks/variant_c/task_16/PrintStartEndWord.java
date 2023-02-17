package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_16;
/*
В тексте нет слов, начинающихся одинаковыми буквами. Напечатать слова
текста в таком порядке, чтобы последняя буква каждого слова совпадала
с первой буквой следующего слова. Если все слова нельзя напечатать в таком
порядке, найти такую цепочку, состоящую из наибольшего количества слов.
 */

import java.util.Arrays;

public class PrintStartEndWord {
    public static void main(String[] args) {
        String text = "армия ярмарка зуй саня одиссей йога";
        String[] words = text.split("\\s");
        System.out.println(Arrays.toString(words));

    }
}