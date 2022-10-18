package avlyakulov.timur.epam.chapter_4.salad.entity;

import java.util.Arrays;

/*
Шеф-повар. Определить иерархию овощей. Сделать салат. Подсчитать ка-
лорийность. Провести сортировку овощей для салата на основе одного из
параметров. Найти овощи в салате, соответствующие заданному диапазону
калорийности.
 */
public class Salad {
    private Vegetable[] vegetables;
    private int current;
    private int weight;
    private int calories;

    public Salad() {
        vegetables = new Vegetable[4];
    }

    public void addToSaladVegetable(Vegetable vegetable) {
        if (current == vegetables.length) {
            Vegetable[] vegetables1 = new Vegetable[vegetables.length + 1];
            System.arraycopy(vegetables, 0, vegetables1, 0, vegetables.length);
            vegetables = vegetables1;
        }
        vegetables[current] = vegetable;
        ++current;
    }

    public void countWeightAndCalories() {
        System.out.println("Counting...");
        for (Vegetable vegetable : vegetables) {
            if (vegetable != null) {
                weight += vegetable.getWeight();
                calories += vegetable.getCalories();
            }
        }
    }

    public int getWeight() {
        return weight;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "vegetables=" + Arrays.toString(vegetables) +
                "\n weight=" + weight +
                "\n calories=" + calories +
                '}';
    }
}