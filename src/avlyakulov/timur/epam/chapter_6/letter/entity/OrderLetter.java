package avlyakulov.timur.epam.chapter_6.letter.entity;

import avlyakulov.timur.epam.chapter_6.letter.entity.Letter;

import java.util.Date;
import java.util.Objects;

public class OrderLetter extends Letter {
    public int cost;

    public OrderLetter(String sender, String text, int cost) {
        super(sender, text);
        super.date = new Date();
        this.cost = cost;
    }


    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OrderLetter that = (OrderLetter) o;
        return cost == that.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cost);
    }

    @Override
    public String toString() {
        return "OrderLetter{" +
                "cost=" + cost +
                "} " + super.toString();
    }
}
