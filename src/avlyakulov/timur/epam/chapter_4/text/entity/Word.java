package avlyakulov.timur.epam.chapter_4.text.entity;

public class Word {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        if (word.contains(" "))
            System.out.println("You enter more than 1 word, please enter 1 word");
        else {
            this.word = word;
        }
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }
}
