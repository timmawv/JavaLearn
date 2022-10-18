package avlyakulov.timur.epam.chapter_4.salad.entity;

public class Vegetable {
    private int weight;
    private int calories;

    Vegetable(int weight, int calories) {
        this.weight = weight;
        this.calories = calories;
    }

    public int getWeight () {
        return weight;
    }

    public int getCalories () {
        return calories;
    }

    @Override
    public String toString() {
        return  ", weight=" + weight +
                ", calories=" + calories +
                '}';
    }
}