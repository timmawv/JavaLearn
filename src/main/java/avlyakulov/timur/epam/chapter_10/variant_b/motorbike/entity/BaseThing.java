package avlyakulov.timur.epam.chapter_10.variant_b.motorbike.entity;

import java.io.Serializable;

/*
Мотоциклист. Определить иерархию амуниции. Экипировать мотоциклиста. Подсчитать стоимость. Провести сортировку амуниции на основе веса.
Найти элементы амуниции, соответствующие заданному диапазону параметров цены
 */
public class BaseThing implements Serializable {
    private int cost;
    private int weight;
    private static final long serialVersionUID = 1L;

    public BaseThing(int cost, int weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "{" +
                "cost=" + cost +
                ", weight=" + weight +
                '}';
    }
}