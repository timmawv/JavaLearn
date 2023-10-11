package avlyakulov.timur.interview.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    private Car[] cars;
    private int counter;

    public MyArrayList(int carsCanStore) {
        cars = new Car[carsCanStore];
        counter = 0;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(3);
        myArrayList.addCarToGarage(new Car(12, 20));
        myArrayList.addCarToGarage(new Car(14, 30));
        myArrayList.addCarToGarage(new Car(15, 30));
        myArrayList.addCarToGarage(new Car(16, 30));
        myArrayList.addCarToGarage(new Car(17, 30));
        myArrayList.addToSpecialIndex(1, new Car(13, 60));
        System.out.println(Arrays.toString(myArrayList.getCars()));
    }

    public void addCarToGarage(Car car) {
        if (counter == cars.length)
            expandGarageByOneCar();
        cars[counter] = car;
        ++counter;
    }

    public void addToSpecialIndex(int index, Car car) {
        if (counter == cars.length) {
            expandGarageByOneCar();
        }
        System.arraycopy(cars, index, cars, index + 1, cars.length - index - 1);
        cars[index] = car;
        ++counter;
    }

    private void expandGarageByOneCar() {
        Car[] newGarage = new Car[cars.length + 1];
        System.arraycopy(cars, 0, newGarage, 0, cars.length);
        cars = newGarage;
    }

    public int numberCarsInGarage() {
        int size = 0;
        for (Car car : cars)
            if (car != null)
                ++size;
        return size;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
}