package avlyakulov.timur.epam.chapter_7.example.reference;

import avlyakulov.timur.epam.chapter_6.example.entity.RightTriangle;

import java.util.function.Function;

public class TriangleFactory {
    //фабрика с применением ссылки на конструктор
    private final Function<Double[], RightTriangle> triangle = RightTriangle::new;
    public RightTriangle getTriangle (Double... sides) {
        return triangle.apply(sides);
    }

    public static void main(String[] args) {
        TriangleFactory factory = new TriangleFactory();
        RightTriangle triangle = factory.getTriangle(1.2,2.3);
        System.out.println(triangle);
        RightTriangle triangle1 = factory.getTriangle(2.4,2.52);
        System.out.println(triangle1);
    }
}
