package avlyakulov.timur.epam.chapter_4.transport.entity;

public class Lux extends Coupe{
    private final int levelComfort = 5;

    public Lux (int capacityPassenger, int capacityBaggage) {
        super(capacityPassenger,capacityBaggage);
    }

    @Override
    public String toString() {
        return "Lux{" +
                "capacityPassenger=" + getCapacityPassenger() +
                "capacityBaggage=" + getCapacityBaggage() +
                "levelComfort=" + levelComfort +
                '}';
    }
}