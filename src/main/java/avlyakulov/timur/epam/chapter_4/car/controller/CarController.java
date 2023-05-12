package avlyakulov.timur.epam.chapter_4.car.controller;

import avlyakulov.timur.epam.chapter_4.car.entity.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarController {
    private Car car;

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else {
                    crud(position, reader);
                }
            }
        } catch (IOException e) {
            System.out.println("problem " + e.getMessage());
        }
    }

    public boolean checkCar() {
        if (car == null) {
            System.out.println("You dont create a car");
            return false;
        } else return true;
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("if you want to create a car press 1");
        System.out.println("if you want to drive a car press 2");
        System.out.println("if you want to refuel your car press 3");
        System.out.println("if you want to change your wheel press 4");
        System.out.println("if you want to print car model press 5");
        System.out.println("if you want finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createCar(reader);
            case "2" -> {
                if (checkCar()) car.drive();
            }
            case "3" -> {
                if (checkCar()) car.refuel();
            }
            case "4" -> {
                if (checkCar()) car.changeWheel();
            }
            case "5" -> {
                if (checkCar()) car.printCarModel();
            }
        }
        runNavigation();
    }

    public void createCar(BufferedReader reader) {
        try {
            System.out.print("Creating a car... \n" + "Enter the name of model car - ");
            String model = reader.readLine();
            car = new Car(model);
        } catch (IOException e) {
            System.out.println("your problem is " + e.getMessage());
        }

    }
}