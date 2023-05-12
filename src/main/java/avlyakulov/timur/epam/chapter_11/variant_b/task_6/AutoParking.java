package avlyakulov.timur.epam.chapter_11.variant_b.task_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//Реализовать класс, моделирующий работу N-местной автостоянки. Машина
//подъезжает к определенному месту и едет вправо, пока не встретится сво-
//бодное место. Класс должен поддерживать методы, обслуживающие приезд
//и отъезд машины.
public class AutoParking {
    private Map<Integer, Boolean> parking;

    public AutoParking() {
        parking = new HashMap<>();
        Random rd = new Random(); // creating Random object
        for (int i = 0; i < 30; ++i) {
            parking.put(i, rd.nextBoolean());
        }
    }

    public void chooseParkingPlace() {
        System.out.println("Car is going to parking...");
        for (int i = 0; i < parking.size(); ++i) {
            if (!parking.get(i)) {
                System.out.println("Car found place to park so we are parking here");
                System.out.println("Take your ticket with number of place " + i);
                parking.computeIfPresent(i, (k, v) -> v = true);
                break;
            } else System.out.println("This parking spot is busy! Continue finding...");
        }
    }

    public void printOurMapOfParking() {
        System.out.println(parking);
    }

    public static void main(String[] args) {
        AutoParking autoParking = new AutoParking();
        autoParking.printOurMapOfParking();
        autoParking.chooseParkingPlace();
        autoParking.printOurMapOfParking();
        autoParking.chooseParkingPlace();
        autoParking.printOurMapOfParking();
        autoParking.chooseParkingPlace();
        autoParking.printOurMapOfParking();
        autoParking.chooseParkingPlace();
        autoParking.printOurMapOfParking();
        autoParking.chooseParkingPlace();
        autoParking.printOurMapOfParking();
        autoParking.chooseParkingPlace();
        autoParking.printOurMapOfParking();
    }
}
