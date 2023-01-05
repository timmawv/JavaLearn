package avlyakulov.timur.epam.chapter_6.product.entity;

public class Milk extends AbstractProduct {
    private final int shelfLife;

    public Milk(int id, int cost, int fatPercent) {
        super.id = id;
        super.cost = cost;
        super.place = "Shopping room";
        super.fatPercent = fatPercent;
        this.shelfLife = 3;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "id=" + id +
                ", cost=" + cost +
                ", place='" + place + '\'' +
                ", fatPercent=" + fatPercent +
                ", shelfLife=" + shelfLife +
                "} " + '\n';
    }
}