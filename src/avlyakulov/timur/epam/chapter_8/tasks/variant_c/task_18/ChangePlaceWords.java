package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_18;

import java.util.Arrays;

/*
В предложении из n слов первое слово поставить на место второго, второе —
на место третьего и т.д., (n-1)-е слово — на место n-го, n-е слово поставить на
место первого. В исходном и преобразованном предложениях между слова-
ми должны быть или один пробел, или знак препинания и один пробел.
 */
public class ChangePlaceWords {
    public static void main(String[] args) {
        String text = "первый второй третий четвертый пятый шестой";
        String[] words = text.split("\\s");
        String textChanged = "";
        for (int i = words.length - 1; i > 0; --i) {
            String s = words[i];
            words[i] = words[i - 1];
            words[i - 1] = s;
        }
        for (String w : words) {
            textChanged = textChanged.concat(w + ", ");
        }
        System.out.println(textChanged);
    }
}