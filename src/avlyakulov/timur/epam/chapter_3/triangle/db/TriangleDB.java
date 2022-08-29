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
}