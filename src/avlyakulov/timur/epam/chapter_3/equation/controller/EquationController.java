package avlyakulov.timur.epam.chapter_3.equation.controller;

import avlyakulov.timur.epam.chapter_3.equation.entity.QuadraticEquation;
import avlyakulov.timur.epam.chapter_3.equation.service.EquationService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquationController {
    private final EquationService equationService = new EquationService();

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select your option ");
        String position;
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
        System.out.println("if you want create equation, please enter 1");
        System.out.println("if you want find roots, please enter 2");
        System.out.println("if you want find interval, please enter 3");
        System.out.println("if you want findAll equations, please enter 4");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createEquation(reader);
            case "2" -> findRoots(reader);
            case "3" -> findAscendingDescendingInterval(reader);
            case "4" -> findAll();
        }
        runNavigation();
    }

    public void createEquation(BufferedReader reader) {
        try {
            System.out.println("ax^2 + bx + c");
            System.out.println("Enter a");
            String aString = reader.readLine();
            int a = Integer.parseInt(aString);
            System.out.println("Enter b");
            String bString = reader.readLine();
            int b = Integer.parseInt(bString);
            System.out.println("Enter c");
            String cString = reader.readLine();
            int c = Integer.parseInt(cString);
            QuadraticEquation quadraticEquation = new QuadraticEquation();
            quadraticEquation.setA(a);
            quadraticEquation.setB(b);
            quadraticEquation.setC(c);
            equationService.createEquation(quadraticEquation);
        } catch (IOException e) {
            System.out.println("problem: " + e.getMessage());
        }
    }
    public void findRoots (BufferedReader reader) {
        try {
            QuadraticEquation[] equations = equationService.findAll();
            System.out.println("Choose to findRoots:");
            for (QuadraticEquation equation : equations)
                if (equation != null)
                    System.out.println(equation);
            String chooseString = reader.readLine();
            int choose = Integer.parseInt(chooseString);
            int [] roots = equationService.findRoots(equations[choose - 1]);
            System.out.println("X1 = " + roots[0] + " X2 = " + roots[1]);
        }
        catch (IOException e) {
            System.out.println("problem: " + e.getMessage());
        }
    }
    public void findAscendingDescendingInterval (BufferedReader reader) {
        try {
            QuadraticEquation[] equations = equationService.findAll();
            System.out.println("Choose to findRoots:");
            for (QuadraticEquation equation : equations)
                if (equation != null)
                    System.out.println(equation);
            String chooseString = reader.readLine();
            int choose = Integer.parseInt(chooseString);
            String interval = equationService.findAscendingDescendingInterval(equations[choose - 1]);
            System.out.println(interval);
        }
        catch (IOException e) {
            System.out.println("problem: " + e.getMessage());
        }
    }
    public void findAll () {
        QuadraticEquation[] equations = equationService.findAll();
        System.out.println("Our equations:");
        for (QuadraticEquation quadraticEquation : equations)
            if (quadraticEquation != null)
                System.out.println(quadraticEquation);
    }
}