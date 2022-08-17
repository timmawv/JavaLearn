package avlyakulov.timur.epam.chapter_3.car.dao;

import avlyakulov.timur.epam.chapter_3.car.db.CarDB;
import avlyakulov.timur.epam.chapter_3.car.entity.Car;

public class CarDao {
    public void create (Car car) {
        CarDB.getInstance().create(car);
    }
    public Car[] getCarGivenModelMoreThanGivenYear (String model, int yearOfExploitation) {
        return CarDB.getInstance().getCarGivenModelMoreThanGivenYear(model,yearOfExploitation);
    }
    public Car[] getGivenYearReleasePriceMoreThanGiven(int yearRelease, int price) {
        return CarDB.getInstance().getGivenYearReleasePriceMoreThanGiven(yearRelease,price);
    }
    public Car [] findAll () {
        return CarDB.getInstance().findAll();
    }
}
