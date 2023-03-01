package avlyakulov.timur.epam.chapter_10.variant_b.entity;

public class BMW extends Car {

    public BMW(int cost, int fuelConsumption, int speed) {
        super(cost, fuelConsumption, speed);
    }

    @Override
    public String toString() {
        return "BMW{} " + super.toString();
    }
}