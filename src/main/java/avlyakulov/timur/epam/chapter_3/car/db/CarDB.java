package avlyakulov.timur.epam.chapter_3.car.db;

import avlyakulov.timur.epam.chapter_3.car.entity.Car;

import java.time.LocalDate;
import java.util.UUID;

public class CarDB {
    private Car[] cars;
    private static int current;
    private static CarDB instance;

    private CarDB() {
        cars = new Car[10];
    }

    public static CarDB getInstance() {
        if (instance == null)
            instance = new CarDB();
        return instance;
    }

    public void create(Car car) {
        car.setId(generateId());
        if (current == cars.length) {
            Car[] cars1 = new Car[cars.length + 1];
            System.arraycopy(cars, 0, cars1, 0, cars.length);
            cars = cars1;
        }
        cars[current] = car;
        ++current;
    }

    public Car[] getCarGivenModelMoreThanGivenYear(String model, int yearOfExploitation) {
        int i = 0;
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();
        Car[] cars1 = new Car[cars.length];
        for (Car car : cars)
            if (car != null)
                if (car.getModel().equals(model) && (current_Year - car.getYearRelease()) > yearOfExploitation) {
                    cars1[i] = car;
                    ++i;
                }
        return cars1;
    }

    public Car[] getGivenYearReleasePriceMoreThanGiven(int yearRelease, int price) {
        int i = 0;
        Car[] cars1 = new Car[cars.length];
        for (Car car : cars)
            if (car != null)
                if (car.getYearRelease() == yearRelease && car.getPrice() > price) {
                    cars1[i] = car;
                    ++i;
                }
        return cars1;
    }
    public Car [] findAll () {
        return cars;
    }

    public String generateId() {
        return UUID.randomUUID().toString();
    }
}
