package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_23;

import java.util.Arrays;

//Все слова текста встречаются четное количество раз, за исключением одного.
//Определить это слово. При сравнении слов регистр не учитывать.
public class FindOtherWord {
    public static void main(String[] args) {
        String text = "Важное важное слово наш, другое другое тоже тоже слово наш слово";
        String[] words = text.replaceAll(",","").split("\\s");
        System.out.println(Arrays.toString(words));
        for (int j = 0; j < words.length; ++j) {
            int counter = 1;
            for (int i = 0; i < words.length; ++i) {
                if (i != j && words[j].toLowerCase().equalsIgnoreCase(words[i]))
                    ++counter;
            }
            if (counter % 2 != 0)
                System.out.println("Наше слово которое встречается нечетное количество раз " + words[j]);
        }
    }
}