package avlyakulov.timur.epam.chapter_4.owl.entity;
/*
Создать объект класса Наседка, используя классы Птица, Воробей.
Методы: летать, петь, нести яйца, высиживать птенцов.
 */
public class Owl extends Sparrow {
    private String name;

    public Owl (String name) {
        super(name);
        this.name = name;
    }

    public void carryEggs() {
        System.out.println("Our owl carrying the eggs");
    }

    @Override
    public void sing() {
        System.out.println("Our owl is singing");
    }

    public void fly () {
        System.out.println("Our owl is flying");
    }

    public void hatchTheChicks () {
        System.out.println("Our owl is hatching chicks");
    }
}
