package avlyakulov.timur.epam.chapter_3.triangle.entity;
/*
Определить класс Треугольник на плоскости. Определить площадь и пе-
риметр треугольника. Создать массив/список/множество объектов и под-
считать количество треугольников разного типа (равносторонний, равнобедренный,
прямоугольный, произвольный). Определить для каждой группы
наибольший и наименьший по площади (периметру) объект.
 */
public class Triangle {
    private int a;
    private int b;
    private int c;
    private int square;
    private int perimeter;
    private String type;

    public void setSquare(int square) {
        this.square = square;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getSquare() {
        return square;
    }
    public int getPerimeter() {
        return perimeter;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return " {" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}