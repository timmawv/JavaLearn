package avlyakulov.timur.epam.chapter_8.tasks.variant_b.task_5;


/*
В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.
 */
public class ReplaceFirstAndLastWordSentence {
    public static void main(String[] args) {
        String text = "Наше первое предложение было написано вчера вечером.Наше второе предложение вчера вечером есть очень хорошее?Наше третье было предложение есть?";
        String[] sentences = text.split("[.!?]");
        text = "";
        for (String s : sentences) {
            String[] words = s.split("\\s");
            String str = words[0];
            words[0] = words[words.length - 1];
            words[words.length - 1] = str;
            s = "";
            for (String w : words) {
                s += w + " ";
            }
            text += s + ". ";
        }
        System.out.println(text);
    }
}