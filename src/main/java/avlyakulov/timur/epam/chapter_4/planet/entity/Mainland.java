package avlyakulov.timur.epam.chapter_4.planet.entity;

public class Mainland {
    private String name;

    public Mainland (String name) {
        this.name = name;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }

    @Override
    public String toString() {
        return "Mainland{" +
                "name='" + name + '\'' +
                '}';
    }
}
