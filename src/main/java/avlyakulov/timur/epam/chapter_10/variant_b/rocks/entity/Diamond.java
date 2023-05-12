package avlyakulov.timur.epam.chapter_10.variant_b.rocks.entity;

import java.io.Serializable;

public class Diamond extends Rock implements Serializable {

    public Diamond(int cost, int transparency) {
        super(cost, transparency);
    }

    @Override
    public String toString() {
        return "Diamond " + super.toString();
    }
}