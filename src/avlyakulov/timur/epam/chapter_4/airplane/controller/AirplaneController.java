package avlyakulov.timur.epam.chapter_4.airplane.controller;

import avlyakulov.timur.epam.chapter_4.airplane.entity.Airplane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AirplaneController {
    private Airplane airplane;

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
    public boolean checkPlaneCreate () {
        if (airplane == null) {
            System.out.println("You dont create an airplane, please create the plane");
            return false;
        }
        else
            return true;
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("if you want to create a plane press 1");
        System.out.println("if you want to fly press 2");
        System.out.println("if you want to choose destination of plane press 3");
        System.out.println("if you want to print route press 4");
        System.out.println("if you want finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> CreatePlane(reader);
            case "2" -> {
                if (checkPlaneCreate()) airplane.fly();
            }
            case "3" -> {
                if (checkPlaneCreate()) setRoute(reader);
            }
            case "4" -> {
                if (checkPlaneCreate()) airplane.printRoute();
            }
        }
        runNavigation();
    }

    public void CreatePlane(BufferedReader reader) {
        try {
            System.out.println("Enter position of plane ");
            String position = reader.readLine();
            airplane = new Airplane(position);
        } catch (IOException e) {
            System.out.println("problem " + e.getMessage());
        }
    }
    public void setRoute (BufferedReader reader) {
        try {
            System.out.println("Please enter destination ");
            String destination = reader.readLine();
            airplane.setRoute(destination);
        } catch (IOException e) {
            System.out.println("problem " + e.getMessage());
        }
    }
}
