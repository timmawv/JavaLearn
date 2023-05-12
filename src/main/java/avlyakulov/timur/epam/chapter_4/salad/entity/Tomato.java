package avlyakulov.timur.epam.chapter_4.salad.entity;

public class Tomato extends Vegetable {

    public Tomato (int weight, int calories) {
        super(weight,calories);
    }

    @Override
    public String toString() {
        return "Tomato{} " + super.toString();
    }
}