package avlyakulov.timur.epam.chapter_3.fraction.controller;

import avlyakulov.timur.epam.chapter_3.fraction.entity.Fraction;
import avlyakulov.timur.epam.chapter_3.fraction.service.FractionService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FractionController {
    private final FractionService fractionService = new FractionService();

    public void run() {
        System.out.println("Select your option ");
        String position;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                position = reader.readLine();
                if (position.equals("0"))
                    System.exit(0);
                crud(position, reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("if you want create fraction, please enter 1");
        System.out.println("if you want get all fractions, please enter 2");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> addToFractions(reader);
            case "2" -> findAll();
        }
        runNavigation();
    }

    public void addToFractions(BufferedReader reader) {
        try {
            System.out.println("Enter m");
            String mStr = reader.readLine();
            int m = Integer.parseInt(mStr);
            System.out.println("Enter n");
            String nStr = reader.readLine();
            int n = Integer.parseInt(nStr);
            Fraction fraction = new Fraction();
            fraction.setM(m);
            fraction.setN(n);
            fractionService.addToFractions(fraction);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void findAll() {
        Fraction[] fractions = fractionService.findAll();
        for (Fraction fraction : fractions)
            if (fraction != null)
                System.out.println("Fraction=" + fraction);
    }
}
