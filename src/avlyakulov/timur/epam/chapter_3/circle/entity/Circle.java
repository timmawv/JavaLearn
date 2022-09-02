package avlyakulov.timur.epam.chapter_3.circle.entity;

import java.util.IllegalFormatCodePointException;

/*
Определить класс Окружность на плоскости, координаты центра которой
задаются с помощью Рациональной Дроби. Определить площадь и пери-
метр. Создать массив/список/множество объектов и определить группы
окружностей, центры которых лежат на одной прямой. Определить наи-
больший и наименьший по площади (периметру) объект.
 */
public class Circle {
    private Fraction center;
    private int radius;


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Fraction getCenter() {
        if (center == null)
            center = new Fraction();
        return center;
    }

    public void setCenter(Fraction center) {
        this.center = center;
    }

    public String toString() {
        return "Circle: center A(" + center.getA() + ";" + center.getB() + ") and radius of this circle is " + radius;
    }
}
