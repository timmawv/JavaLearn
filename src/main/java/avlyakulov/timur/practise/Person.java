package avlyakulov.timur.practise;

public class Person {
    private String name;
    private int id;
    private static int current;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}