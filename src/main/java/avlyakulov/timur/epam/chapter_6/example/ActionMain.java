package avlyakulov.timur.epam.chapter_6.example;

import avlyakulov.timur.epam.chapter_6.example.entity.Rectangle;
import avlyakulov.timur.epam.chapter_6.example.entity.RightTriangle;
import avlyakulov.timur.epam.chapter_6.example.entity.ShapeAction;
import avlyakulov.timur.epam.chapter_6.example.impl.RectangleAction;
import avlyakulov.timur.epam.chapter_6.example.impl.TriangleAction;

public class ActionMain {
    public static void main(String[] args) {
        ShapeAction action;
        try {
            Rectangle rectShape = new Rectangle(2,5);
            action = new RectangleAction();
            System.out.println("Square rectangle: " + action.computeSquare(rectShape));
            System.out.println("Perimeter rectangle: " + action.computePerimeter(rectShape));
            RightTriangle trShape = new RightTriangle(3,4);
            action = new TriangleAction();
            System.out.println("Square rectangle: " + action.computeSquare(trShape));
            System.out.println("Perimeter rectangle: " + action.computePerimeter(trShape));
            System.out.println(action.computeSquare(rectShape));

        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
