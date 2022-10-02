package avlyakulov.timur.epam.chapter_4.text.entity;

import java.util.Arrays;

public class Sentence {
    private Word[] sentence;
    private int current = 0;

    public Sentence() {
        sentence = new Word[10];
    }

    public void addWordToSentence(Word word) {
        if (current == sentence.length) {
            Word[] words1 = new Word[sentence.length + 1];
            System.arraycopy(sentence, 0, words1, 0, sentence.length);
            sentence = words1;
        }
        sentence[current] = word;
        ++current;
    }

    @Override
    public String toString() {
        String words = "";
        for (Word word : sentence)
            if (word != null)
                words += word.getWord() + " ";
        return words;
    }
}