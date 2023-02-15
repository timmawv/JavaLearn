package avlyakulov.timur.epam.chapter_8.tasks.variant_b.task_10;

import java.util.Arrays;

/*
Существует текст и список слов. Для каждого слова из заданного списка
найти, сколько раз оно встречается в каждом предложении, и рассортировать
слова по убыванию общего количества вхождений.
 */
public class SortListWords {
    public static void main(String[] args) {
        String text = "Анкара анкара слово слово слово машина машина текст кот собака собака";
        String[] listWords = {"анкара", "слово", "машина", "текст", "кот", "собака", "санки"};
        int[] valueWords = new int[listWords.length];
        String[] wordsText = text.split("\\s");
        int counter;
        for (int j = 0; j < listWords.length; ++j) {
            counter = 0;
            for (String s : wordsText) {
                if (listWords[j].equalsIgnoreCase(s))
                    ++counter;
            }
            valueWords[j] = counter;
            System.out.format("Данное слово %s встречается %d раза\n", listWords[j], valueWords[j]);
        }
        System.out.println(Arrays.toString(listWords));
        System.out.println(Arrays.toString(valueWords));
        for (int j = 0; j < valueWords.length; ++j)
            for (int i = 0; i < valueWords.length - 1; ++i)
                if (valueWords[i] > valueWords[i + 1]) {
                    int a = valueWords[i];
                    valueWords[i] = valueWords[i + 1];
                    valueWords[i + 1] = a;
                    String str = listWords[i];
                    listWords[i] = listWords[i + 1];
                    listWords[i + 1] = str;
                }
        for (int j = 0; j < listWords.length; ++j)
            System.out.format("Данное слово %s встречается %d раза\n", listWords[j], valueWords[j]);
    }
}