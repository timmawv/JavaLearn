package avlyakulov.timur.epam.chapter_6.letter.entity;

import java.util.Date;
import java.util.Objects;

public class Letter extends AbstractLetter {
    private String sender;

    protected Date date;

    public Letter(String sender, String text) {
        this.sender = sender;
        super.text = text;
        date = new Date();
    }
    public void setSender (String sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return Objects.equals(sender, letter.sender) && Objects.equals(date, letter.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, date);
    }

    @Override
    public String toString() {
        return "Letter{" +
                "sender='" + sender + '\'' +
                ", date=" + date +
                ", text='" + text + '\'' +
                "} ";
    }
}