package avlyakulov.timur.epam.chapter_10.variant_b.car.entity;

import java.io.Serializable;

public class Mazda extends Car implements Serializable {
    public Mazda(int cost) {
        super(cost);
    }

    @Override
    public String toString() {
        return "Model of car : Mazda " + super.toString();
    }
}