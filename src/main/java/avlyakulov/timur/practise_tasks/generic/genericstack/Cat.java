package avlyakulov.timur.practise_tasks.generic.genericstack;

public class Cat {
    private int age;
    private String color;

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}