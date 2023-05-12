package avlyakulov.timur.epam.chapter_6.example.generic.impl;

import avlyakulov.timur.epam.chapter_6.example.generic.entity.ShapeGeneric;
import avlyakulov.timur.epam.chapter_6.example.entity.RightTriangle;

public class TriangleGeneric implements ShapeGeneric<RightTriangle> {

    @Override
    public double computeSquare(RightTriangle shape) {
        return 0.5 * shape.getSideA() * shape.getSideB();
    }

    @Override
    public double computePerimeter(RightTriangle shape) {
        return shape.getSideA() + shape.getSideB() + Math.hypot(shape.getSideA(), shape.getSideB());
    }
}
