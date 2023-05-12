package avlyakulov.timur.epam.chapter_7.example.impl;

import avlyakulov.timur.epam.chapter_7.example.entity.ShapeService;


public class RectangleService implements ShapeService {
    @Override
    public double perimeter(double a, double b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        //пример Эволюции лямбды выражений
        ShapeService rectangleService = (double a, double b) -> {
            a = 2.3;
            b = 3.3;
            return 2 * (a + b);
        };
        ShapeService rectangleService2 = (double a, double b) ->  2 * (a + b);
        ShapeService rectangleService3 = (a, b) -> 2 * (a + b);

    }
}
