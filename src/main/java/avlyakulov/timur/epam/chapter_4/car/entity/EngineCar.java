package avlyakulov.timur.epam.chapter_4.car.entity;

public class EngineCar {

    private int fuel;

    public EngineCar() {
        fuel = 3;
    }
    public void refuel () {}

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}