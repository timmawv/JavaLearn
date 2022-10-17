package avlyakulov.timur.epam.chapter_4.salad.entity;

/*
Шеф-повар. Определить иерархию овощей. Сделать салат. Подсчитать ка-
лорийность. Провести сортировку овощей для салата на основе одного из
параметров. Найти овощи в салате, соответствующие заданному диапазону
калорийности.
 */
public class Salad {
    private Vegetable[] vegetables;
    private int weight;

    public Salad () {
        vegetables = new Vegetable[4];
    }

}
