package avlyakulov.timur.epam.chapter_10.variant_b.motorbike.entity;

public class Gloves extends BaseThing {
    public Gloves(int cost, int weight) {
        super(cost, weight);
    }

    @Override
    public String toString() {
        return "Gloves " + super.toString();
    }

}