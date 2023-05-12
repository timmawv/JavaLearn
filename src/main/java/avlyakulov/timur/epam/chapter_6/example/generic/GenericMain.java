package avlyakulov.timur.epam.chapter_6.example.generic;

import avlyakulov.timur.epam.chapter_6.example.generic.entity.ShapeGeneric;
import avlyakulov.timur.epam.chapter_6.example.generic.impl.RectangleGeneric;
import avlyakulov.timur.epam.chapter_6.example.generic.impl.TriangleGeneric;
import avlyakulov.timur.epam.chapter_6.example.entity.Rectangle;
import avlyakulov.timur.epam.chapter_6.example.entity.RightTriangle;

public class GenericMain {
    public static void main(String[] args) {
        Rectangle  rectangle = new Rectangle(2,5);
        ShapeGeneric<Rectangle> rectangleGeneric = new RectangleGeneric();
        RightTriangle triangle = new RightTriangle(3,4);
        ShapeGeneric <RightTriangle> triangleGeneric = new TriangleGeneric();
        System.out.println("Square rectangle " + rectangleGeneric.computeSquare(rectangle));
        System.out.println("Perimeter rectangle " + rectangleGeneric.computePerimeter(rectangle));


        System.out.println("Square triangle " + triangleGeneric.computeSquare(triangle));
        System.out.println("Perimeter triangle " + triangleGeneric.computePerimeter(triangle));
    }
}
