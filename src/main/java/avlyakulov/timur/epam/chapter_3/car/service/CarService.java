package avlyakulov.timur.epam.chapter_3.car.service;

import avlyakulov.timur.epam.chapter_3.car.dao.CarDao;
import avlyakulov.timur.epam.chapter_3.car.entity.Car;

public class CarService {
    private final CarDao carDao = new CarDao();

    public void create (Car car) {
         carDao.create(car);
    }
    public Car[] getCarGivenModelMoreThanGivenYear (String model, int yearOfExploitation) {
        return carDao.getCarGivenModelMoreThanGivenYear(model, yearOfExploitation);
    }
    public Car[] getGivenYearReleasePriceMoreThanGiven (int yearRelease, int price) {
        return carDao.getGivenYearReleasePriceMoreThanGiven(yearRelease, price);
    }
    public Car[] findAll () {
        return carDao.findAll();
    }
}
