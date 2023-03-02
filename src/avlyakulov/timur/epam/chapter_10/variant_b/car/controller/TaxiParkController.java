package avlyakulov.timur.epam.chapter_10.variant_b.car.controller;

import avlyakulov.timur.epam.chapter_10.variant_b.car.entity.BMW;
import avlyakulov.timur.epam.chapter_10.variant_b.car.entity.Car;
import avlyakulov.timur.epam.chapter_10.variant_b.car.entity.Mazda;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class TaxiParkController implements Serializable {
    Car[] cars = new Car[3];
    private int numbersOfCars = 0;
    transient Scanner sc = new Scanner(System.in);
    File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_b\\car\\controller\\rocks_info.txt");

    public void run() {
        String position;
        runNavigation();
        while ((position = sc.next()) != null) {
            if (position.equals("0"))
                System.exit(0);
            else
                crud(position, sc);
            runNavigation();
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create car press 1");
        System.out.println("If you want to print all your taxi park press 2");
        System.out.println("If you want to count price of your taxi park press 3");
        System.out.println("If you want sort your cars by fuel press 4");
        System.out.println("If you want to find your car by speed range press 5");
        System.out.println("If you want to save your taxi park to file press 6");
        System.out.println("If you want to restore you taxi park press 7");
        System.out.println("If you want to finish your program press 0");
        System.out.println();

    }

    public void crud(String position, Scanner sc) {
        switch (position) {
            case "1" -> createCar(sc);
            case "2" -> printTaxiPark();
            case "3" -> countPricePark();
            case "4" -> sortCarsByFuel();
            case "5" -> findBySpeedRange();
            case "6" -> safeToFileOurPark();
            case "7" -> restorePark();
            default -> System.out.println("You have enter the wrong value");
        }
    }

    public void createCar(Scanner sc) {
        Car car = null;
        System.out.println("Введите стоимость вашей машины");
        int cost = sc.nextInt();
        System.out.println("Choose type of Car that you want to create\n1.Mazda\n2.BMW");
        int type = Integer.parseInt(sc.next());
        switch (type) {
            case 1 -> car = new Mazda(cost);
            case 2 -> car = new BMW(cost);
        }
        if (numbersOfCars == cars.length) {
            Car[] cars1 = new Car[cars.length + 1];
            System.arraycopy(cars, 0, cars1, 0, cars.length);
            cars = cars1;
        }
        cars[numbersOfCars] = car;
        ++numbersOfCars;
        System.out.println("Your car was created and add to taxi park");
    }

    public void printTaxiPark() {
        for (Car car : cars)
            if (car != null) {
                System.out.println(car);
            }
    }

    public void countPricePark() {
        int sum = Arrays.stream(cars).filter(car -> car != null).mapToInt(Car::getCost).sum();
        System.out.printf("Стоимость вашего автопарка %d\n", sum);
    }

    public void sortCarsByFuel() {
        Arrays.sort(cars, (c1, c2) -> c1.getFuelConsumption() - c2.getFuelConsumption());
        System.out.println("Sorting was finished");
    }

    public void findBySpeedRange() {
        System.out.println("Введити диапазон скорости 1 граница:");
        int firstLimit = sc.nextInt();
        System.out.println("Введите 2 границу:");
        int secondLimit = sc.nextInt();
       Arrays.stream(cars)
               .filter(c -> c.getSpeed() < secondLimit)
               .filter(c -> c.getSpeed() > firstLimit)
               .toList()
               .forEach(System.out::println);
    }

    public void safeToFileOurPark() {
        try (ObjectOutputStream writer = new ObjectOutputStream( new FileOutputStream(file))) {
            writer.writeObject(cars);
            writer.writeObject(numbersOfCars);
        } catch (IOException e) {
            throw new RuntimeException("Can't find file",e);
        }
    }

    public void restorePark() {
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_b\\car\\controller\\rocks_info.txt");
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))) {
            cars = (Car[]) reader.readObject();
            numbersOfCars = (int) reader.readObject();
            System.out.println("You taxi park was restored");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Can't find file", e);
        }
    }
}