package avlyakulov.timur.epam.chapter_10.variant_b.motorbike.entity;

public class Jacket extends BaseThing {
    public Jacket (int cost,int weight) {
        super(cost,weight);
    }


    @Override
    public String toString() {
        return "Jacket " + super.toString();
    }
}