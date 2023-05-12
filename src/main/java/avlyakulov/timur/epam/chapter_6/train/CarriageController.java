package avlyakulov.timur.epam.chapter_6.train;

import avlyakulov.timur.epam.chapter_6.train.entity.Destination;
import avlyakulov.timur.epam.chapter_6.train.entity.Owner;
import avlyakulov.timur.epam.chapter_6.train.entity.Status;
import avlyakulov.timur.epam.chapter_6.train.impl.CarriageActionImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CarriageController {
    CarriageActionImpl carriage;

    public boolean isTrainCreated() {
        if (carriage == null) {
            System.out.println("You didn't create a train");
            return false;
        } else return true;
    }

    public void run() {
        String position;
        runNavigation();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else {
                    crud(reader, position);
                }
                runNavigation();
            }

        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public void crud(BufferedReader reader, String position) {
        switch (position) {
            case "1" -> {
                if (carriage != null)
                    System.out.println("You have created the train");
                else {
                    createCarriage(reader);
                }
            }
            case "2" -> {
                if (isTrainCreated())
                    System.out.println("Your weight of train is " + carriage.getWeight());
            }
            case "3" -> {
                if (isTrainCreated()) {
                    System.out.println("Your train start to go to destination");
                    carriage.sendToDestination();
                }
            }
            case "4" -> {
                if (isTrainCreated())
                    carriage.repair();
            }
            case "5" -> {
                if (isTrainCreated())
                    System.out.println(carriage.getStatus());
            }
            case "6" -> {
                if (isTrainCreated())
                    System.out.println(carriage);
            }
            default -> System.out.println("You enter the wrong value");
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create carriages press 1");
        System.out.println("If you want to get weight press 2");
        System.out.println("If you want to send to destination press 3");
        System.out.println("If you want to repair your train press 4");
        System.out.println("If you want to get status of your train 5");
        System.out.println("If you want to get all information about train press 6");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }

    public void createCarriage(BufferedReader reader) {
        try {
            System.out.println("please enter registration number of your train");
            String number = reader.readLine();
            System.out.println(Arrays.toString(Destination.values()));
            System.out.println("From this list choose destination of your train");
            Destination destination = Destination.valueOf(reader.readLine().toUpperCase());
            System.out.println(Arrays.toString(Owner.values()));
            System.out.println("From this list choose owner of your train");
            Owner owner = Owner.valueOf(reader.readLine().toUpperCase());
            System.out.println(Arrays.toString(Status.values()));
            System.out.println("From this list choose status of your train");
            Status status = Status.valueOf(reader.readLine().toUpperCase());
            carriage = new CarriageActionImpl(number, destination, owner, status);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

}
