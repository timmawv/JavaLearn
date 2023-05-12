package avlyakulov.timur.epam.chapter_6.example.impl;

import avlyakulov.timur.epam.chapter_6.example.entity.AbstractShape;
import avlyakulov.timur.epam.chapter_6.example.entity.RightTriangle;
import avlyakulov.timur.epam.chapter_6.example.entity.ShapeAction;

public class TriangleAction implements ShapeAction {

    @Override
    public double computeSquare(AbstractShape shape) {
        double square;
        if (shape instanceof RightTriangle triangle) {
            square = 1./2 * triangle.getSideA() * triangle.getSideB();
        }
        else {
            throw new IllegalArgumentException("Incompatible shape" + shape.getClass());
        }
        return square;
    }

    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimeter;
        if (shape instanceof RightTriangle triangle) {
            perimeter = triangle.getSideA() + triangle.getSideB() + Math.hypot(triangle.getSideA(), triangle.getSideB());

        }
        else {
            throw new IllegalArgumentException("Incompatible shape" + shape.getClass());
        }
        return perimeter;
    }
}