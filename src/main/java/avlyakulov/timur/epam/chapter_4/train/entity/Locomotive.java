package avlyakulov.timur.epam.chapter_4.train.entity;

public class Locomotive extends ReservedSeat {
    private final String name;

    public Locomotive(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Locomotive{" +
                "name='" + name + '\'' +
                '}';
    }
}