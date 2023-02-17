package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_13;

import java.util.Arrays;

/*
Алгоритм Барроуза-Уиллера для сжатия текстов основывается на преобра-
зовании Барроуза-Уиллера. Оно производится следующим образом: для
слова рассматриваются все его циклические сдвиги, которые затем сорти-
руются в алфавитном порядке, после чего формируется слово из последних
символов отсортированных циклических сдвигов. К примеру, для слова
JAVA циклические сдвиги — это JAVA, AVAJ, VAJA, AJAV. После сорти-
ровки по алфавиту получим AJAV, AVAJ, JAVA, VAJA. Значит, результат
преобразования — слово VJAA. Реализовать программно преобразование
Барроуза-Уиллера для данного слова.
 */
public class BurrowsWheelerEncryption {
    public static void main(String[] args) {
        String word = "JAVA";
        System.out.println(word);
        char[] wordChar = word.toCharArray();
        String[] words = new String[word.length()];
        for (int i = 0; i < wordChar.length; ++i) {
            words[i] = String.valueOf(wordChar);
            for (int j = 0; j < wordChar.length - 1; ++j) {
                char c = wordChar[j];
                wordChar[j] = wordChar[j + 1];
                wordChar[j + 1] = c;
            }
        }
        words = Arrays.stream(words).sorted().toArray(String[]::new);
        String wordEncryption = "";
        for (int i = 0; i < wordChar.length; ++i)
            wordEncryption = wordEncryption.concat(String.valueOf(words[i].charAt(words.length - 1)));
        System.out.println(wordEncryption);

    }
}