package avlyakulov.timur.epam.chapter_3.triangle.db;

import avlyakulov.timur.epam.chapter_3.triangle.entity.Triangle;

public class TriangleDB {
    private static TriangleDB instance;
    private int current;
    private Triangle[] triangles;

    private TriangleDB() {
        triangles = new Triangle[10];
    }

    public static TriangleDB getInstance() {
        if (instance == null)
            instance = new TriangleDB();
        return instance;
    }

    public void createTriangle(Triangle triangle) {
        if (current == triangles.length) {
            Triangle[] triangles1 = new Triangle[triangles.length + 1];
            System.arraycopy(triangles, 0, triangles1, 0, triangles1.length);
            triangles = triangles1;
        }
        triangles[current] = triangle;
        ++current;
    }

    public Triangle[] findAll() {
        return triangles;
    }

    public void checkTypeTriangle() {
        for (Triangle triangle : triangles)
            if (triangle != null)
                if (triangle.getA() == triangle.getB() && triangle.getA() == triangle.getC())
                    System.out.println("equilateral Triangle:" + triangle);
                else if ((triangle.getA() == triangle.getB()))
                    System.out.println("isosceles:" + triangle);
                else if ((Math.pow(triangle.getA(), 2) + Math.pow(triangle.getB(), 2)) == Math.pow(triangle.getC(), 2))
                    System.out.println("Rectangular triangle:" + triangle);
                else
                    System.out.println("Random triangle:" + triangle);
    }
    public String checkType (Triangle triangle) {
                if (triangle.getA() == triangle.getB() && triangle.getA() == triangle.getC())
                    return "Equilateral";
                else if ((triangle.getA() == triangle.getB() && triangle.getC() != triangle.getB() && triangle.getC() != triangle.getA()) || (triangle.getA() == triangle.getC() && triangle.getB() != triangle.getC() && triangle.getB() != triangle.getA()) || (triangle.getB() == triangle.getC() && triangle.getA() != triangle.getB() && triangle.getA() != triangle.getC()))
                    return "Isosceles";
                else if ((Math.pow(triangle.getA(), 2) + Math.pow(triangle.getB(), 2)) == Math.pow(triangle.getC(), 2))
                    return "Rectangular";
                else
                    return "Random";
    }
    public void countAllTypes () {
        int equilateral = 0;
        int isosceles = 0;
        int rectangular = 0;
        int random = 0;
        for (Triangle triangle : triangles)
            if (triangle != null) {
                switch (triangle.getType()) {
                    case "Equilateral" -> ++equilateral;
                    case "Isosceles" -> ++isosceles;
                    case "Rectangular" -> ++rectangular;
                    case "Random" -> ++random;
                }
            }
        System.out.println("Count of types:");
        System.out.println("Equilateral - " + equilateral);
        System.out.println("Isosceles - " + isosceles);
        System.out.println("Rectangular - " + rectangular);
        System.out.println("Random - " + random);
    }
    public Triangle [] findMaxSquareBetweenTypes (){
        int max = 0;
        Triangle [] container = new Triangle[4];
        int count = 0;
        for (Triangle triangle : triangles)
            if (triangle != null)
                if (triangle.getType().equals("Equilateral"))
                    if (triangle.getSquare() > max) {
                        max = triangle.getSquare();
                        container[count] = triangle;
                    }
        ++count;
        for (Triangle triangle : triangles)
            if (triangle != null)
                if (triangle.getType().equals("Isosceles"))
                    if (triangle.getSquare() > max) {
                        max = triangle.getSquare();
                        container[count] = triangle;
                    }
        ++count;
        for (Triangle triangle : triangles)
            if (triangle != null)
                if (triangle.getType().equals("Rectangular"))
                    if (triangle.getSquare() > max) {
                        max = triangle.getSquare();
                        container[count] = triangle;
                    }
        ++count;
        for (Triangle triangle : triangles)
            if (triangle != null)
                if (triangle.getType().equals("Random"))
                    if (triangle.getSquare() > max) {
                        max = triangle.getSquare();
                        container[count] = triangle;
                    }
        return container;
    }
}