package avlyakulov.timur.epam.chapter_10.variant_b.car.controller;

import avlyakulov.timur.epam.chapter_10.variant_b.car.entity.Car;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class GetTaxiPark {
    public static void main(String[] args) {
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_b\\car\\controller\\taxi-park_info.txt");
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))) {
            Car[] cars = (Car[]) reader.readObject();
            System.out.println(Arrays.toString(cars));
            int numberOfCars = (int) reader.readObject();
            System.out.println("Number of cars " + numberOfCars);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Can't find file", e);
        }
    }
}
