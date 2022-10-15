package avlyakulov.timur.epam.chapter_4.transport.entity;

public class Coupe extends ReservedSeat{
    private final int levelComfort = 4;

    public Coupe (int capacityPassenger, int capacityBaggage) {
        super(capacityPassenger,capacityBaggage);
    }

    @Override
    public String toString() {
        return "Coupe{" +
                "capacityPassenger=" + getCapacityPassenger() +
                "capacityBaggage=" + getCapacityBaggage() +
                "levelComfort=" + levelComfort +
                '}';
    }
}
