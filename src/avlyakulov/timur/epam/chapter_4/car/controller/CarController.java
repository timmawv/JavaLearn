package avlyakulov.timur.epam.chapter_4.car.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarController {
    public void run () {
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
    public void runNavigation() {
        System.out.println("if you want enter or add text press 1");
        System.out.println("if you want to print your text press 2");
        System.out.println("if you want finish program press 0");
        System.out.println();
    }
    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> enterText(reader);
            case "2" -> printText();
        }
        runNavigation();
    }
}