package avlyakulov.timur.epam.chapter_6.example.entity.generic;

import avlyakulov.timur.epam.chapter_6.example.entity.Rectangle;


public class GenericMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5);
        ShapeGeneric<Rectangle> rectangleGeneric;
    }
}