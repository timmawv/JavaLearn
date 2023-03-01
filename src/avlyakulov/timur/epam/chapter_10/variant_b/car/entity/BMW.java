package avlyakulov.timur.epam.chapter_10.variant_b.car.entity;

import java.io.Serializable;

public class BMW extends Car implements Serializable {

    public BMW(int cost) {
        super(cost);
    }

    @Override
    public String toString() {
        return "Model of car : BMW " + super.toString();
    }
}