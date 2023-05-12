package avlyakulov.timur.epam.chapter_4.salad.entity;

public class Cucumber extends Vegetable{
    public Cucumber (int weight, int calories) {
        super(weight,calories);
    }

    @Override
    public String toString() {
        return "Cucumber{} " + super.toString();
    }
}
