package avlyakulov.timur.epam.chapter_3.car.controller;

import avlyakulov.timur.epam.chapter_3.car.entity.Car;
import avlyakulov.timur.epam.chapter_3.car.service.CarService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarController {
    private final CarService carService = new CarService();

    public  void run () {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select your option ");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null){
                crud(position,reader);
                position = reader.readLine();
                if (position.equals("0"))
                    System.exit(0);
                crud(position,reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("if you want create car, please enter 1");
        System.out.println("if you want get car with given model and year of exploitation is mor than you give, please enter 2");
        System.out.println("if you want find car with this year release and price is more than you give, please enter 3");
        System.out.println("if you want findAll cars, please enter 4");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }
    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> create(reader);
            case "2" -> getCarGivenModelMoreThanGivenYear(reader);
            case "3" -> getGivenYearReleasePriceMoreThanGiven(reader);
            case "4" -> findAll();
        }
        runNavigation();
    }
    public void create (BufferedReader reader) {
        System.out.println("CarController.create");
        try {
            System.out.println("Enter mark car");
            String mark = reader.readLine();
            System.out.println("Enter model car");
            String model = reader.readLine();
            System.out.println("Enter year release");
            String yearReleaseStr = reader.readLine();
            int yearRelease = Integer.parseInt(yearReleaseStr);
            System.out.println("Enter color of car");
            String color = reader.readLine();
            System.out.println("Enter price of car");
            String priceStr = reader.readLine();
            int price = Integer.parseInt(priceStr);
            Car car = new Car();
            car.setMark(mark);
            car.setModel(model);
            car.setYearRelease(yearRelease);
            car.setColor(color);
            car.setPrice(price);
            carService.create(car);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void getCarGivenModelMoreThanGivenYear (BufferedReader reader) {
        try {
            System.out.println("Enter model of car");
            String model = reader.readLine();
            System.out.println("Enter years of explanation");
            String yearStr = reader.readLine();
            int year = Integer.parseInt(yearStr);
            Car [] cars = carService.getCarGivenModelMoreThanGivenYear(model,year);
            System.out.println("Cars GivenModelMoreThanGivenYear ");
            for (Car car : cars)
                if (car != null)
                    System.out.println(car);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void getGivenYearReleasePriceMoreThanGiven (BufferedReader reader) {
        try {
            System.out.println("Enter year of release");
            String yearReleaseStr = reader.readLine();
            int yearRelease = Integer.parseInt(yearReleaseStr);
            System.out.println("Enter price to find car more expensive");
            String priceStr = reader.readLine();
            int price = Integer.parseInt(priceStr);
            Car [] cars = carService.getGivenYearReleasePriceMoreThanGiven(yearRelease,price);
            System.out.println("Cars GivenYearReleasePriceMoreThanGiven ");
            for (Car car : cars)
                if (car != null)
                    System.out.println(car);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void findAll() {
        System.out.println("Our cars");
        Car [] cars = carService.findAll();
        for (Car car : cars)
            if (car != null)
                System.out.println(car);
    }
}