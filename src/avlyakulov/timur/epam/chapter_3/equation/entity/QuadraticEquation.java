package avlyakulov.timur.epam.chapter_3.equation.entity;
/*
Определить класс Квадратное уравнение. Реализовать методы для поиска
корней, экстремумов, а также интервалов убывания/возрастания. Создать
массив/список/множество объектов и определить наибольшие и наимень-
шие по значению корни.
 */

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

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

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "equation='" + a + "x^2 + " + b + "x + " + c +
                '}';
    }
}