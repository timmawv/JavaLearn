package avlyakulov.timur.epam.chapter_3.circle.controller;

import avlyakulov.timur.epam.chapter_3.circle.entity.Circle;
import avlyakulov.timur.epam.chapter_3.circle.service.CircleService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleController {
    private final CircleService circleService = new CircleService();

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
        System.out.println("if you want create circle, please enter 1");
        System.out.println("if you want find square of circle, please enter 2");
        System.out.println("if you want find perimeter of circle, please enter 3");
        System.out.println("if you want find max and min circle, please enter 4");
        System.out.println("if you want findAll circles, please enter 5");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createCircle(reader);
            case "2" -> findSquare(reader);
            case "3" -> findPerimeter(reader);
            case "4" -> findMaxAndMin();
            case "5" -> findAll();
        }
        runNavigation();
    }

    public void createCircle(BufferedReader reader) {
        try {
            System.out.println("Our circle has center A(a;b) and radius - r");
            System.out.println("Enter a");
            String aStr = reader.readLine();
            int a = Integer.parseInt(aStr);
            System.out.println("Enter b");
            String bStr = reader.readLine();
            int b = Integer.parseInt(bStr);
            System.out.println("Enter radius");
            String radiusStr = reader.readLine();
            int radius = Integer.parseInt(radiusStr);
            Circle circle = new Circle();
            circle.getCenter().setA(a);
            circle.getCenter().setB(b);
            circle.setRadius(radius);
            circleService.createCircle(circle);
        } catch (IOException e) {
            System.out.println("problem: " + e.getMessage());
        }
    }

    public void findSquare(BufferedReader reader) {
        try {
            Circle[] circles = circleService.findAll();
            for (Circle circle : circles)
                if (circle != null)
                    System.out.println(circle);
            System.out.println("Choose circle to find square");
            String chooseStr = reader.readLine();
            int choose = Integer.parseInt(chooseStr);
            double square = circleService.findSquare(circles[choose - 1]);
            System.out.println("Square of our circle is " + square);
        } catch (IOException e) {
            System.out.println("problem: " + e.getMessage());
        }
    }

    public void findPerimeter(BufferedReader reader) {
        try {
            Circle[] circles = circleService.findAll();
            for (Circle circle : circles)
                if (circle != null)
                    System.out.println(circle);
            System.out.println("Choose circle to find perimeter");
            String chooseStr = reader.readLine();
            int choose = Integer.parseInt(chooseStr);
            double square = circleService.findPerimeter(circles[choose - 1]);
            System.out.println("Perimeter of our circle is " + square);
        } catch (IOException e) {
            System.out.println("problem: " + e.getMessage());
        }
    }

    public void findMaxAndMin() {
        Circle[] circles = circleService.findAll();
        circleService.findMaxAndMinCircle(circles);
    }

    public void findAll() {
        Circle[] circles = circleService.findAll();
        for (Circle circle : circles)
            if (circle != null)
                System.out.println(circle);
    }
}