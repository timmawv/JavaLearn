package avlyakulov.timur.epam.chapter_4.salad.entity;

public class Onion extends Vegetable{

    public Onion (int weight, int calories) {
        super(weight,calories);
    }

    @Override
    public String toString() {
        return "Onion{} " + super.toString();
    }
}
