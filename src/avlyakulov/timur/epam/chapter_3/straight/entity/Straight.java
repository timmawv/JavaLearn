package avlyakulov.timur.epam.chapter_3.straight.entity;

/*Определить класс Прямая на плоскости (в пространстве), параметры кото-
рой задаются с помощью Рациональной Дроби. Определить точки пересе-
чения прямой с осями координат. Определить координаты пересечения
двух прямых. Создать массив/список/множество объектов и определить
группы параллельных прямых. */


public class Straight {
    private Fraction fraction;

    public Fraction getFraction() {
        if (fraction == null)
            fraction = new Fraction();
        return fraction;
    }

    public void setFraction(Fraction fraction) {
        this.fraction = fraction;
    }

    public String toString() {
        return "Straight: " + fraction.getA() + "x + " + fraction.getB() + "y = 1";
    }
}