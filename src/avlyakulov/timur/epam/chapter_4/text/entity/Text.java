package avlyakulov.timur.epam.chapter_4.text.entity;

import java.util.Arrays;
/*Создать объект класса Текст, используя классы Предложение, Слово.
        Методы: дополнить текст, вывести на консоль текст, заголовок текста. */
public class Text {

    private Sentence[] text;
    private String tittle;
    private int current;

    public Text () {
        text = new Sentence[10];
    }

    public void addText(Sentence sentence) {
        if (current == text.length) {
            Sentence[] sentences = new Sentence[text.length + 1];
            System.arraycopy(text, 0, sentences, 0, text.length);
            text = sentences;
        }
        text[current] = sentence;
        ++current;
    }

    public void printText() {
        System.out.println(Arrays.toString(text));
    }

    public void printTextTittle() {
        System.out.println();
    }

    public void setSentences(Sentence[] sentences) {
        this.text = sentences;
    }

    public Sentence[] getSentences() {
        return text;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + Arrays.toString(text) +
                '}';
    }
}