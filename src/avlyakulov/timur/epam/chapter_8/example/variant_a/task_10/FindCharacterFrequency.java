package avlyakulov.timur.epam.chapter_8.example.variant_a.task_10;

/*
В тексте найти и напечатать n символов (и их количество), встречающихся
наиболее часто.
 */
public class FindCharacterFrequency {
    public static void main(String[] args) {
        String text = "Наш текст который очень важен, так же он очень хороший, мы его читаем,вот наши важные слова";
        char[] textChar = text.replaceAll("[,\\s]", "").toLowerCase().toCharArray();
        char[] symbols = new char[textChar.length];
        int count = 0;
        int symbolCounter = 0;
        for (int i = 0; i < textChar.length - 1; ++i) {
            if (i != 0 && checkSymbolFromArray(symbols, textChar[i]))
                continue;
            for (int j = i + 1; j < textChar.length; ++j) {
                if (textChar[i] == textChar[j])
                    ++count;
            }
            if (count > 2) {
                System.out.println("Our letter " + textChar[i] + " : " + (count + 1));
                symbols[symbolCounter] = textChar[i];
                ++symbolCounter;
            }
            count = 0;
        }
    }

    public static boolean checkSymbolFromArray(char[] text, char symbol) {
        for (char c : text) {
            if (symbol == c)
                return true;
        }
        return false;
    }
}