package avlyakulov.timur.practise.wildcard.fruit;

//Напишите метод, который принимает список фруктов и возвращает количество фруктов, которые имеют вес больше 100 грамм.
public class Fruit {
    private int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}