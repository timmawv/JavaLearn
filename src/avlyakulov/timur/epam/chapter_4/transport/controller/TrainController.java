package avlyakulov.timur.epam.chapter_4.transport.controller;

import avlyakulov.timur.epam.chapter_4.transport.entity.Coupe;
import avlyakulov.timur.epam.chapter_4.transport.entity.Lux;
import avlyakulov.timur.epam.chapter_4.transport.entity.ReservedSeat;
import avlyakulov.timur.epam.chapter_4.transport.entity.Train;

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
        System.out.println("if you want finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> train = new Train();
            case "2" -> {
                if (checkTrain()) addToTrainCarriage(reader);
            }
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
                    ReservedSeat reservedSeat = new ReservedSeat(numberPassengers,capacityBaggage);
                    train.addToTrainCarriage(reservedSeat);
                }
                case "2" -> {
                    System.out.println("Enter the number of passengers");
                    int numberPassengers = Integer.parseInt(reader.readLine());
                    System.out.println("Enter the capacity of baggage");
                    int capacityBaggage = Integer.parseInt(reader.readLine());
                    Coupe coupe = new Coupe(numberPassengers,capacityBaggage);
                    train.addToTrainCarriage(coupe);
                }
                case "3" -> {
                    System.out.println("Enter the number of passengers");
                    int numberPassengers = Integer.parseInt(reader.readLine());
                    System.out.println("Enter the capacity of baggage");
                    int capacityBaggage = Integer.parseInt(reader.readLine());
                    Lux lux = new Lux(numberPassengers,capacityBaggage);
                    train.addToTrainCarriage(lux);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void printTypeOfCarriage () {
        System.out.println("Choose type of carriage that you want to add ");
        System.out.println("1 - Reserved seat");
        System.out.println("2 - Coupe");
        System.out.println("3 - Lux");
    }

}
