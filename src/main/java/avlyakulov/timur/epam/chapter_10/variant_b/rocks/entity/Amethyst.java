package avlyakulov.timur.epam.chapter_10.variant_b.rocks.entity;

import java.io.Serializable;

public class Amethyst extends Rock implements Serializable {
    public Amethyst(int cost, int transparency) {
        super(cost, transparency);
    }

    @Override
    public String toString() {
        return "Amethyst " + super.toString();
    }
}
