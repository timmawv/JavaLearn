package avlyakulov.timur.epam.chapter_6.example.impl;

import avlyakulov.timur.epam.chapter_6.example.entity.AbstractShape;
import avlyakulov.timur.epam.chapter_6.example.entity.Rectangle;
import avlyakulov.timur.epam.chapter_6.example.entity.ShapeAction;

public class RectangleAction implements ShapeAction {

    @Override
    public double computeSquare(AbstractShape shape) {
        double square;
        if (shape instanceof Rectangle rectangle)
            square = rectangle.getHeight() * rectangle.getWidth();
        else {
            throw new IllegalArgumentException("Incompatible shape " + shape.getClass());
        }
        return square;
    }

    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimeter;
        if (shape instanceof Rectangle rectangle)
            perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
        else {
            throw new IllegalArgumentException("Incompatible shape " + shape.getClass());
        }
        return perimeter;
    }
}
