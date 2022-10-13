package avlyakulov.timur.epam.chapter_4.owl.entity;

/*
Создать объект класса Наседка, используя классы Птица, Воробей.
Методы: летать, петь, нести яйца, высиживать птенцов.
 */
public class Sparrow extends Bird {
    private final String name;

    public Sparrow (String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void carryEggs() {
        System.out.println("Our sparrow carrying the eggs");
    }

    @Override
    public void sing() {
        System.out.println("Our sparrow is singing");
    }

    public void fly () {
        System.out.println("Our sparrow is flying");
    }

    public void hatchTheChicks () {
        System.out.println("Our sparrow is hatching chicks");
    }
}
