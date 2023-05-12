package avlyakulov.timur.epam.chapter_3.array.entity;
/*
Определить класс Массив. Создать методы сортировки: обменная сорти-
ровка (метод пузырька); обменная сортировка «Шейкер-сортировка», сор-
тировка посредством выбора (метод простого выбора), сортировка вставка-
ми: метод хеширования (сортировка с вычислением адреса), сортировка
вставками (метод простых вставок), сортировка бинарного слияния, сорти-
ровка Шелла (сортировка с убывающим шагом).
 */

import java.util.Arrays;

public class Massiv {
    public int [] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Massiv {" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}