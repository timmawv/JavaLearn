package avlyakulov.timur.epam.chapter_10.variant_b.entity;

public class Mazda extends Car {
    public Mazda(int cost, int fuelConsumption, int speed) {
        super(cost, fuelConsumption, speed);
    }
    @Override
    public String toString() {
        return "Mazda{} " + super.toString();
    }
}