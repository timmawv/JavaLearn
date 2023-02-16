package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_5;

/*
Осуществить сжатие английского текста, заменив каждую группу из двух
или более рядом стоящих символов на один символ, за которым следует
количество его вхождений в группу. К примеру, строка hellowoooorld долж-
на сжиматься в hel2owo4rld
 */
public class TextCompression {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hello people it is our wooorld");
        int counterWords;
        for (int i = 0; i < text.length() - 1; ++i) {
            int counterNextWord = i + 1;
            counterWords = 1;
            while (text.charAt(i) == text.charAt(counterNextWord)) {
                ++counterWords;
                //text.deleteCharAt(counterNextWord);
                ++counterNextWord;
                if (text.charAt(i) != text.charAt(counterNextWord))
                    text.insert(counterNextWord,counterWords);
            }
        }
        System.out.println(text);
    }
}