package avlyakulov.timur.epam.chapter_6.example.entity.generic;


import avlyakulov.timur.epam.chapter_6.example.entity.RightTriangle;

public class TriangleGeneric implements ShapeGeneric<RightTriangle> {
    @Override
    public double computerSquare(RightTriangle shape) {
        return 0.5 * shape.getSideA() * shape.getSideB();
    }

    @Override
    public double computerPerimeter(RightTriangle shape) {
        double a = shape.getSideA();
        double b = shape.getSideB();
        return a + b + Math.hypot(a, b);
    }
}
