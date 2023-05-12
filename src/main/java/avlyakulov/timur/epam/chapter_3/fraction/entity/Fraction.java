package avlyakulov.timur.epam.chapter_3.fraction.entity;
/* Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
        Объявить и инициализировать массив из k дробей, ввести/вывести значе-
        ния для массива дробей.*/


public class Fraction {
    private int m;
    private int n;



    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }



    @Override
    public String toString() {
        return "Fraction{ " +
                 m +
                "/" + n +
                " }";
    }
}