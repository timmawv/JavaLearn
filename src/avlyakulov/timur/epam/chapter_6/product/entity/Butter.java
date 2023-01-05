package avlyakulov.timur.epam.chapter_6.product.entity;


public class Butter extends AbstractProduct {
    private final int shelfLife;

    public Butter(int id, int cost, int fatPercent) {
        super.id = id;
        super.cost = cost;
        super.place = "Shopping room";
        super.fatPercent = fatPercent;
        this.shelfLife = 4;
    }

    @Override
    public String toString() {
        return "Butter{" +
                "id=" + id +
                ", cost=" + cost +
                ", place='" + place + '\'' +
                ", fatPercent=" + fatPercent +
                ", shelfLife=" + shelfLife +
                "} " + '\n';
    }
}