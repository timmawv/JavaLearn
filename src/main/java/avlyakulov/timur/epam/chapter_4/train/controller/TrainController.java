package avlyakulov.timur.epam.chapter_4.train.controller;

import avlyakulov.timur.epam.chapter_4.train.entity.Coupe;
import avlyakulov.timur.epam.chapter_4.train.entity.Lux;
import avlyakulov.timur.epam.chapter_4.train.entity.ReservedSeat;
import avlyakulov.timur.epam.chapter_4.train.entity.Train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainController {
    private Train train;

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

    public boolean checkTrain() {
        if (train == null) {
            System.out.println("You dont create a train");
            return false;
        } else return true;
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("if you want to create a train  press 1");
        System.out.println("if you want to add to train carriage  press 2");
        System.out.println("if you want to add to look all train press 3");
        System.out.println("if you want to get summary number of passengers and weight of train press press 4");
        System.out.println("if you want to sort train by level of comfort press press 5");
        System.out.println("if you want to get carriages from your diapason press press 6");
        System.out.println("if you want finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> {
                if (train == null) {
                    System.out.println("Creating a train...");
                    train = new Train();
                } else
                    System.out.println("You have created train");

            }
            case "2" -> {
                if (checkTrain()) addToTrainCarriage(reader);
            }
            case "3" -> {
                if (checkTrain()) System.out.println(train);
            }
            case "4" -> {
                if (checkTrain()) getNumberOfPassengersAndWeight();
            }
            case "5" -> {
                if (checkTrain()) train.sortByLevelComfort();
            }
            case "6" -> {
                if (checkTrain()) printCarriagesFromDiapason(reader);
            }
            default -> System.out.println("You enter wrong number. Try again");
        }
        runNavigation();
    }

    public void addToTrainCarriage(BufferedReader reader) {
        try {
            printTypeOfCarriage();
            String answer = reader.readLine();
            switch (answer) {
                case "1" -> {
                    System.out.println("Enter the number of passengers");
                    int numberPassengers = Integer.parseInt(reader.readLine());
                    System.out.println("Enter the capacity of baggage");
                    int capacityBaggage = Integer.parseInt(reader.readLine());
                    ReservedSeat reservedSeat = new ReservedSeat(numberPassengers, capacityBaggage);
                    train.addToTrainCarriage(reservedSeat);
                }
                case "2" -> {
                    System.out.println("Enter the number of passengers");
                    int numberPassengers = Integer.parseInt(reader.readLine());
                    System.out.println("Enter the capacity of baggage");
                    int capacityBaggage = Integer.parseInt(reader.readLine());
                    Coupe coupe = new Coupe(numberPassengers, capacityBaggage);
                    train.addToTrainCarriage(coupe);
                }
                case "3" -> {
                    System.out.println("Enter the number of passengers");
                    int numberPassengers = Integer.parseInt(reader.readLine());
                    System.out.println("Enter the capacity of baggage");
                    int capacityBaggage = Integer.parseInt(reader.readLine());
                    Lux lux = new Lux(numberPassengers, capacityBaggage);
                    train.addToTrainCarriage(lux);
                }
                default -> System.out.println("You enter wrong number");
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("Your enter wrong number " + e.getMessage());
        }
    }

    public void getNumberOfPassengersAndWeight() {
        System.out.println("Counting all features...");
        int numberOfPassengers = 0, weight = 0;
        train.getNumberOfPassengersAndWeight(train.getAll(), numberOfPassengers, weight);
        System.out.println("Number of passengers is " + train.getNumberOfPassengers());
        System.out.println("Summary weight is " + train.getWeight());
    }

    public void printCarriagesFromDiapason(BufferedReader reader) {
        try {
            System.out.println("Getting carriages from your diapason");
            System.out.println("Enter begin of capacity Passenger ");
            int pasBegin = Integer.parseInt(reader.readLine());
            System.out.println("Enter end of capacity Passenger");
            int pasEnd = Integer.parseInt(reader.readLine());
            System.out.println("Enter begin of capacity of weight");
            int weightBegin = Integer.parseInt(reader.readLine());
            System.out.println("Enter end of capacity of weight");
            int weightEnd = Integer.parseInt(reader.readLine());
            System.out.println("Carriages from diapason");
            train.printCarriagesFromDiapason(pasBegin,pasEnd,weightBegin,weightEnd);
        }
     catch(NumberFormatException | IOException e)  {
        System.out.println("Your enter wrong number " + e.getMessage());
    }
}

    public void printTypeOfCarriage() {
        System.out.println("Choose type of carriage that you want to add ");
        System.out.println("1 - Reserved seat");
        System.out.println("2 - Coupe");
        System.out.println("3 - Lux");
    }

}
