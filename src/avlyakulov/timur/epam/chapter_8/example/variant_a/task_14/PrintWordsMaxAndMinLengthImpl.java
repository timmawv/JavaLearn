package avlyakulov.timur.epam.chapter_8.example.variant_a.task_14;

/*
В тексте найти и напечатать все слова максимальной и все слова минимальной длины
 */
public class PrintWordsMaxAndMinLengthImpl implements PrintWordsMaxAndMinLength {

    @Override
    public void printWords(String text) {
        String[] words = text.split("\\s");
        int maxLength = words[0].length(), minLength = words[0].length();
        for (int i = 1; i < words.length; ++i) {
            if (maxLength < words[i].length())
                maxLength = words[i].length();
            if (minLength > words[i].length())
                minLength = words[i].length();
        }
        System.out.println("Слова с максимально длиной слова");
        for (String w : words)
            if (w.length() == maxLength)
                System.out.println(w);
        System.out.println("Слова с минимальной длиной слова");
        for (String w : words)
            if (w.length() == minLength)
                System.out.println(w);
    }

    public static void main(String[] args) {
        String text = "Наши слова на крылышки вот такие крутые так что да они то очень крутые крутышки";
        new PrintWordsMaxAndMinLengthImpl().printWords(text);
    }
}