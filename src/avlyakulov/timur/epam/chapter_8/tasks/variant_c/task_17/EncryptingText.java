package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_17;

/*
Текст шифруется по следующему правилу: из исходного текста выбирается
1, 4, 7, 10-й и т.д. (до конца текста) символы, затем 2, 5, 8, 11-й и т.д. (до конца
текста) символы, затем 3, 6, 9, 12-й и т.д. Зашифровать заданный текст.
 */
public class EncryptingText {
    public static void main(String[] args) {
        String text = "Наше первое предложение было написано вчера очень поздно вечером." +
                "Наше второе предложение вчера вечером есть очень хорошее?Наше третье было предложение есть?";
        int i = 0;
        int counterCycle = 0;
        int charCounter = 0;
        char[] textEncrypted = new char[text.length()];
        while (counterCycle < 3) {
            for (; i < text.length(); i = i + 3) {
                textEncrypted[charCounter] = text.charAt(i);
                ++charCounter;
            }
            ++counterCycle;
            i = counterCycle;
        }
        System.out.println(textEncrypted);
    }
}