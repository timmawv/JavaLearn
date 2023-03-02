package avlyakulov.timur.epam.chapter_10.variant_b.rocks.entity;

/*
Камни. Определить иерархию драгоценных и полудрагоценных камней.
Отобрать камни для ожерелья. Подсчитать общий вес (в каратах) и стоимость.
Провести сортировку камней ожерелья на основе ценности. Найти камни
в ожерелье, соответствующие заданному диапазону параметров прозрачности.
 */

import java.io.Serializable;

public class Rock implements Serializable {
    private int weight;
    private int cost;
    private int transparency;

    public Rock(int cost, int transparency) {
        weight = (int) ((Math.random() * 10 + 5) * 2);
        this.cost = cost;
        this.transparency = transparency;
    }

    public int getCost() {
        return cost;
    }


    @Override
    public String toString() {
        return " {" +
                "weight=" + weight +
                ", cost=" + cost +
                ", transparency=" + transparency +
                '}';
    }
}