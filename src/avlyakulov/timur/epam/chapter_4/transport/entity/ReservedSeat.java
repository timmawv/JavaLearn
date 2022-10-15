package avlyakulov.timur.epam.chapter_4.transport.entity;

public class ReservedSeat {
    private int capacityPassenger;
    private int capacityBaggage;
    private final int levelComfort = 2;

    public ReservedSeat(int capacityPassenger, int capacityBaggage){
        this.capacityPassenger = capacityPassenger;
        this.capacityBaggage = capacityBaggage;
    }
    public ReservedSeat () {}

    public int getLevelComfort () {
        return levelComfort;
    }


    public int getCapacityPassenger() {
        return capacityPassenger;
    }

    public void setCapacityPassenger(int capacityPassenger) {
        this.capacityPassenger = capacityPassenger;
    }

    public int getCapacityBaggage() {
        return capacityBaggage;
    }

    public void setCapacityBaggage(int capacityBaggage) {
        this.capacityBaggage = capacityBaggage;
    }

    @Override
    public String toString() {
        return "ReservedSeat{" +
                "capacityPassenger=" + capacityPassenger +
                ", capacityBaggage=" + capacityBaggage +
                ", levelComfort=" + levelComfort +
                '}';
    }
}