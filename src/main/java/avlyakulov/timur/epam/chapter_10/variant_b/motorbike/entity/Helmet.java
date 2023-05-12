package avlyakulov.timur.epam.chapter_10.variant_b.motorbike.entity;

public class Helmet extends BaseThing {
    public Helmet (int cost,int weight) {
        super(cost,weight);
    }

    @Override
    public String toString() {
        return "Helmet " + super.toString();
    }
}
