package avlyakulov.timur.epam.chapter_7.example.impl;

import avlyakulov.timur.epam.chapter_7.example.entity.ShapeService;

public class ActionType {
    private double x;
    private double y;

    public ActionType(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double action(ShapeService service) {
        return 10 * service.perimeter(x, y);
    }

    public static void main(String[] args) {
        //обращение к функциональному интерфейсу
        double result = new ActionType(3, 5).action((a, b) -> (a + b) * 2);
        System.out.println(result);
    }
}
