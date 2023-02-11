package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_16;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/*
В стихотворении найти одинаковые буквы, которые встречаются во всех словах.
 */
public class FindSameLetters {
    public static void main(String[] args) {
        String poem = """
                Актябрь ужа наступил—ужа роща отряхает анкара
                Последниа ласты са нагих сваих ветвай
                Дахнул осанний хлад—дорога промерзает
                Журча аще бажит за мельнацу ручай
                На пруда ужа застыл;сасед май поспешает
                Ва отъазжие паля са охатою сваей
                Иа страждут азими ат бешенай забавы
                Иа будат лай собак уснувшае дубравы.""";
        String[] words = poem.toLowerCase().split("[,.;—\\s\\n]");
        boolean isContain;
        System.out.print("Встречающиеся во всех словах буквы: ");
        for (int i = 0; i < words[0].length(); ++i) {
            isContain = true;
            for (String w : words)
                isContain &= w.contains(String.valueOf(words[0].charAt(i)));
            if (isContain)
                System.out.print(words[0].charAt(i) + " ");
        }
    }
}