package avlyakulov.timur.epam.chapter_6.example.generic.impl;

import avlyakulov.timur.epam.chapter_6.example.generic.entity.ShapeGeneric;
import avlyakulov.timur.epam.chapter_6.example.entity.Rectangle;

public class RectangleGeneric implements ShapeGeneric<Rectangle> {
    @Override
    public double computeSquare(Rectangle shape) {
        return shape.getHeight() * shape.getWidth();
    }

    @Override
    public double computePerimeter(Rectangle shape) {
        return 2 * (shape.getWidth() + shape.getHeight());
    }
}
