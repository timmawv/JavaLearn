package avlyakulov.timur.epam.chapter_8.example.variant_a.task_12;

import java.util.Arrays;

/*
В стихотворении найти количество слов, начинающихся и заканчивающихся гласной буквой.
 */
public class FindConsonantWord {
    public static void main(String[] args) {
        String poem = """
                Октябрь уж наступил — уж роща отряхает анкара
                Последние листы с нагих своих ветвей;
                Дохнул осенний хлад — дорога промерзает.
                Журча еще бежит за мельницу ручей,
                Но пруд уже застыл; сосед мой поспешает
                В отъезжие поля с охотою своей,
                И страждут озими от бешеной забавы,
                И будит лай собак уснувшие дубравы.""";
        poem = poem.replace("\n", " ").replaceAll("[\\s—;.,]", " ").replaceAll("\\s+", " ");
        System.out.println(poem);
        String[] words = poem.split("\\s");
        System.out.println(Arrays.toString(words));
        int counter = 0;
        for (String w : words)
            if ((w.startsWith("а") || w.startsWith("о") || w.startsWith("и") || w.startsWith("ы") || w.startsWith("у") || w.startsWith("э"))
                    && ((w.endsWith("а") || w.endsWith("о") || w.endsWith("и") || w.endsWith("ы") || w.endsWith("у") || w.endsWith("э"))))
                ++counter;
        System.out.println("Количество наших слов: " + counter);
    }
}