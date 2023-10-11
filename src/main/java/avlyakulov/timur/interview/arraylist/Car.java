package avlyakulov.timur.interview.arraylist;

public class Car {
    private int number;
    private int speed;

    public Car(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", speed=" + speed +
                '}';
    }
}