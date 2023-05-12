package avlyakulov.timur.epam.chapter_3.circle.db;

import avlyakulov.timur.epam.chapter_3.circle.entity.Circle;

public class CircleDB {
    private static CircleDB instance;
    private static Circle[] circles;
    private static int current;
    public final double PI = 3.14;

    private CircleDB() {
        circles = new Circle[10];
    }

    public static CircleDB getInstance() {
        if (instance == null)
            instance = new CircleDB();
        return instance;
    }
    public void createCircle (Circle circle) {
        if (current == circles.length) {
            Circle[] circles1 = new Circle[circles.length + 1];
            System.arraycopy(circles, 0, circles1, 0, circles.length);
            circles = circles1;
        }
        circles[current] = circle;
        current++;
    }

    public double findSquare(Circle circle) {
        return PI * Math.pow(circle.getRadius(),2);
    }

    public double findPerimeter(Circle circle) {
        return 2 * PI * circle.getRadius();
    }

    public void findMaxAndMinCircles(Circle[] circles) {
        Circle max = circles[0];
        Circle min = circles[0];
        for (Circle circle : circles) {
            if (circle != null) {
                if (findSquare(circle) > findSquare(max))
                    max = circle;
                if (findSquare(circle) < findSquare(min))
                    min = circle;
            }
        }
        System.out.println("Max circle:" + max);
        System.out.println("Min circle:" + min);
    }
    public Circle[] findAll() {
        return circles;
    }
}