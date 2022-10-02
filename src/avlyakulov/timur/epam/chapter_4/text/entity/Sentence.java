package avlyakulov.timur.epam.chapter_4.text.entity;

import java.util.Arrays;

public class Sentence {
    private Word[] sentence;
    private int current = 0;

    public Sentence () {
        sentence = new Word[10];
    }

    public void addWordToSentence (Word word) {
        if (current == sentence.length) {
            Word[] words1 = new Word[sentence.length + 1];
            System.arraycopy(sentence, 0, words1, 0, sentence.length);
            sentence = words1;
        }
        sentence[current] = word;
        ++current;
    }
    public void setWords(Word[] words) {
        this.sentence = words;
    }

    public Word[] getWords() {
        for (int i = 0; i < sentence.length; ++i)
            if (sentence[i] == null)
                sentence[i] = new Word();
        return sentence;
    }


    public String getWordFromSentence(int order) {
        return sentence[order].getWord();
    }


    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + Arrays.toString(sentence) +
                '}';
    }
}