package avlyakulov.timur.epam.chapter_8.tasks.variant_b.task_1;


// Найти наибольшее количество предложений текста, в которых есть одинаковые слова.

public class FindSentence {
    public static void main(String[] args) {
        String text = "Наше первое предложение первое. Наше второе предложение. Наше третье предложение есть есть есть";
        String[] sentences = text.replaceAll("\\. ", ".").split("\\.");
        String[] words;
        int[] arrEqualsWord = new int[sentences.length];
        int counterWords;
        int counterArr = 0;
        for (String s : sentences) {
            words = s.split(" ");
            for (int i = 0; i < words.length; ++i) {
                counterWords = 1;
                for (int j = 0; j < words.length; ++j) {
                    if (i != j && words[i].equals(words[j]))
                        ++counterWords;
                }
                if (counterWords > arrEqualsWord[counterArr])
                    arrEqualsWord[counterArr] = counterWords;
            }
            ++counterArr;
        }
        int maxIndex = findMaxIndex(arrEqualsWord);
        System.out.println("Предложение с максимальным количеством одинаковых слов \n" + sentences[maxIndex]);
    }

    static int findMaxIndex(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for (int num : arr)
            if (num > max)
                max = num;
        for (int i = 0; i < arr.length; ++i)
            if (arr[i] == max)
                maxIndex = i;
        return maxIndex;
    }
}