package avlyakulov.timur.epam.chapter_8.tasks.variant_b.task_3;

//Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений.
public class FindSpecialWord {
    public static void main(String[] args) {
        String text = "Наше первое предложение, было написано вчера вечером. Наше второе предложение, вчера вечером очень хорошее. Наше третье было предложение есть";
        String[] sentences = text.replaceAll("\\. ", ".").split("\\.", 2);
        String[] words = sentences[0].replaceAll(",\\s",",").split("[\\s,]");
        for (String w : words)
            if (!sentences[1].contains(w))
                System.out.println("Слово из 1 предложения которого нет в остальных " + w);
    }
}