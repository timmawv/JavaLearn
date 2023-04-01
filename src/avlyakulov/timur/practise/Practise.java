package avlyakulov.timur.practise;

import java.util.*;

public class Practise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
    }
}

class Car implements Comparable<Car> {
    int cost;
    String name;

    public Car(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public int compareTo(Car o) {
        return this.cost - o.cost;
    }
}