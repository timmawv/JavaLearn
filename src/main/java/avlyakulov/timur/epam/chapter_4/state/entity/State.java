package avlyakulov.timur.epam.chapter_4.state.entity;
/*
Создать объект класса Государство, используя классы Область, Район,Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import java.util.Arrays;

public class State {
    private final String name;
    private final String capital;
    private final int square;

    City[] cities;
    private int counter;

    public State(String name,String capital, int square) {
        this.name = name;
        cities = new City[10];
        this.capital = capital;
        cities[counter] = new City(capital);
        ++counter;
        this.square = square;
    }

    public void printCapital() {
        System.out.println("The capital of " + name + " is " + capital);
    }
    public int numberOfRegion () {
        return counter;
    }
    public void printSquare () {
        System.out.println("Square of " + name + " is " + square);
    }
    public void printCities () {
        for (City city : cities)
            if (city != null)
                System.out.println(city);
    }

    public void addCity (String name) {
        cities[counter] = new City(name);
        ++counter;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", square=" + square +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
}