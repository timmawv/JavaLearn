package avlyakulov.timur.epam.chapter_6.product.entity;

public class Cheese extends AbstractProduct {
    private final int shelfLife;

    public Cheese(int id, int cost, int fatPercent) {
        super.id = id;
        super.cost = cost;
        super.place = "Shopping room";
        super.fatPercent = fatPercent;
        this.shelfLife = 12;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "id=" + id +
                ", cost=" + cost +
                ", place='" + place + '\'' +
                ", fatPercent=" + fatPercent +
                ", shelfLife=" + shelfLife +
                "} " + '\n';
    }
}
