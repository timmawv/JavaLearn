package avlyakulov.timur.epam.chapter_4.state.controller;

import avlyakulov.timur.epam.chapter_4.state.entity.State;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateController {

    private State state;

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

    public boolean checkStateCreate() {
        if (state == null) {
            System.out.println("You dont create a state, please create the state");
            return false;
        } else
            return true;
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("if you want to create a state press 1");
        System.out.println("if you want to print capital press 2");
        System.out.println("if you want to get number of regions press 3");
        System.out.println("if you want to get square press 4");
        System.out.println("if you want to print cities press 5");
        System.out.println("if you want to add city press 6");
        System.out.println("if you want finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> CreateState(reader);
            case "2" -> {
                if (checkStateCreate()) state.printCapital();
            }
            case "3" -> {
                if (checkStateCreate()) System.out.println("Number of regions is " + state.numberOfRegion());
            }
            case "4" -> {
                if (checkStateCreate()) state.printSquare();
            }
            case "5" -> {
                if (checkStateCreate()) state.printCities();
            }
            case "6" -> {
                if (checkStateCreate())  addCity(reader);
            }
        }
        runNavigation();
    }


    public void CreateState(BufferedReader reader) {
        try {
            System.out.println("Enter the name of your State");
            String name = reader.readLine();
            System.out.println("Enter the name of capital");
            String capital = reader.readLine();
            System.out.println("Enter square");
            int square = Integer.parseInt(reader.readLine());
            state = new State(name,capital,square);
        } catch (IOException e) {
            System.out.println("problem " + e.getMessage());
        }
    }
    public void addCity (BufferedReader reader) {
        try {
        System.out.println("Enter the name of city ");
        String name = reader.readLine();
        state.addCity(name);
    } catch (IOException e) {
            System.out.println("problem" + e.getMessage());
        }
    }
}