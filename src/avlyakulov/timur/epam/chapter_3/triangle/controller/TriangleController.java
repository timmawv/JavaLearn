package avlyakulov.timur.epam.chapter_3.triangle.controller;

import avlyakulov.timur.epam.chapter_3.triangle.entity.Triangle;
import avlyakulov.timur.epam.chapter_3.triangle.service.TriangleService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleController {
    private final TriangleService triangleService = new TriangleService();

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
        System.out.println("if you want create triangle, please enter 1");
        System.out.println("if you want checkTriangleType, please enter 2");
        System.out.println("if you want findAll triangles, please enter 3");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createTriangle(reader);
            case "2" -> checkTriangleType();
            case "3" -> findAll();
        }
        runNavigation();
    }

    public void createTriangle(BufferedReader reader) {
        try {
            System.out.println("Enter sites of your Triangle:");
            System.out.println("Enter A:");
            String aStr = reader.readLine();
            int a = Integer.parseInt(aStr);
            System.out.println("Enter B:");
            String bStr = reader.readLine();
            int b = Integer.parseInt(bStr);
            System.out.println("Enter C:");
            String cStr = reader.readLine();
            int c = Integer.parseInt(cStr);
            Triangle triangle = new Triangle();
            triangle.setA(a);
            triangle.setB(b);
            triangle.setC(c);
            triangle.setPerimeter((a + b + c) / 2);
            triangle.setType(triangleService.checkType(triangle));
            switch (triangle.getType()) {
                case "Equilateral" -> triangle.setSquare((a * a) * (int) Math.sqrt(3) / 4);
                case "Isosceles" -> {
                    int h = (a * a) - ((c * c) / 2);
                    triangle.setSquare((h * c) / 2);
                }
                case "Rectangular" -> triangle.setSquare((a * b) / 2);
                default -> {
                    System.out.println("Random");
                    triangle.setSquare(a * b * c);}
            }
            triangleService.createTriangle(triangle);
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
    public void findAll () {
        Triangle [] triangles = triangleService.findAll();
        for (Triangle triangle : triangles)
            if (triangle != null)
                System.out.println( triangle.getType() +" triangle" + triangle);
    }
    public void checkTriangleType () {
        triangleService.checkTriangleType();
    }
}
