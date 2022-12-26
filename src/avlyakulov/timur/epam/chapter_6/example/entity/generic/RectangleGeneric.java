package avlyakulov.timur.epam.chapter_6.example.entity.generic;


import avlyakulov.timur.epam.chapter_6.example.entity.Rectangle;

public class RectangleGeneric implements ShapeGeneric<Rectangle> {
    @Override
    public double computerSquare(Rectangle shape) {
        return shape.getHeight() * shape.getWidth();
    }

    @Override
    public double computerPerimeter(Rectangle shape) {
        return 2 * shape.getHeight() + shape.getWidth();
    }
}
