package avlyakulov.timur.epam.chapter_3.straight.controller;

import avlyakulov.timur.epam.chapter_3.straight.entity.Straight;
import avlyakulov.timur.epam.chapter_3.straight.service.StraightService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StraightController {
    private final StraightService straightService = new StraightService();
    Straight[] straights = straightService.findAll();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void run() {

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
        System.out.println("if you want create straight, please enter 1");
        System.out.println("if you want findPointsOfIntersectionWithTheAxes, please enter 2");
        System.out.println("if you want findPointsOfIntersectionStraights, please enter 3");
        System.out.println("if you want findAll straights, please enter 4");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createStraight(reader);
            case "2" -> findPointsOfIntersectionWithTheAxes(reader);
            case "3" -> findPointsOfIntersectionStraights(reader);
            case "4" -> findAll();
        }
        runNavigation();
    }

    public void createStraight(BufferedReader reader) {
        try {
            System.out.println("Our straight looks ax + by = 1");
            System.out.println("Enter a");
            String aStr = reader.readLine();
            int a = Integer.parseInt(aStr);
            System.out.println("Enter b");
            String bStr = reader.readLine();
            int b = Integer.parseInt(bStr);
            Straight straight = new Straight();
            straight.getFraction().setA(a);
            straight.getFraction().setB(b);
            straightService.createStraight(straight);
        } catch (IOException e) {
            System.out.println("problem: " + e.getMessage());
        }
    }

    public void findPointsOfIntersectionWithTheAxes(BufferedReader reader) {
        try {
            System.out.println("Choose 1 straight to find intersections");
            for (Straight straight : straights)
                if (straight != null)
                    System.out.println(straight);
            String chooseStr = reader.readLine();
            int choose = Integer.parseInt(chooseStr);
            Straight straight = straights[choose - 1];
            double[] points = straightService.findPointsOfIntersectionWithTheAxes(straight);
            System.out.println("Point intersection with X " + points[0]);
            System.out.println("Point intersection with Y " + points[1]);
        } catch (IOException e) {
            System.out.println("problem: " + e.getMessage());
        }
    }

    public void findPointsOfIntersectionStraights(BufferedReader reader) {
        try {
            System.out.println("Choose 2 straights to find intersection");
            System.out.println("Choose 1 straight");
            for (Straight straight : straights)
                if (straight != null) {
                    System.out.println(straight);
                }
            String chooseStr = reader.readLine();
            int choose = Integer.parseInt(chooseStr);
            Straight straight1 = straights[choose - 1];
            System.out.println("Choose 2 straight");
            for (Straight straight : straights)
                if (straight != null) {
                    System.out.println(straight);
                }
            chooseStr = reader.readLine();
            choose = Integer.parseInt(chooseStr);
            Straight straight2 = straights[choose - 1];
            double[] points = straightService.findPointsOfIntersectionStraights(straight1, straight2);
            if (points == null) {
                System.out.println("Points is null");
            } else {
                System.out.println("Point of intersection A(" + points[0] + ";" + points[1] + ")");
            }
        } catch (IOException e) {
            System.out.println("problem: " + e.getMessage());
        }
    }

    public void findAll() {
        Straight[] straights = straightService.findAll();
        for (Straight straight : straights)
            if (straight != null)
                System.out.println(straight);
    }
}