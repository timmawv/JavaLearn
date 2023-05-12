package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_4;

import java.util.Arrays;

/*
Вычеркнуть из текста минимальное количество предложений так, чтобы
у любых двух оставшихся предложений было хотя бы одно общее слово.
 */
public class DeleteMinimumSentencesFromText {
    public static void main(String[] args) {
        String text = "First woman.Second car.Third man.Fourth live.Fifth live";
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));
        text = "";
        loop:
        for (int i = 0; i < sentences.length - 1; ++i) {
            String[] words = sentences[i].split("\\s");
            for (String w : words)
                for (int j = i + 1; j < sentences.length; ++j) {
                    if (sentences[j].contains(w)) {
                        text += sentences[i] + ". " + sentences[j];
                        break loop;
                    }
                }
        }
        System.out.println(text);
    }
}