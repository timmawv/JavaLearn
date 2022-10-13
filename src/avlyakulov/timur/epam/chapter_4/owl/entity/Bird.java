package avlyakulov.timur.epam.chapter_4.owl.entity;

/*
Создать объект класса Наседка, используя классы Птица, Воробей.
Методы: летать, петь, нести яйца, высиживать птенцов.
 */
public class Bird {
    private final String name;

    public Bird (String name) {
        this.name = name;
    }

    public void carryEggs () {
        System.out.println("Our bird is carrying eggs");
    }
    public void sing () {
        System.out.println("Our bird is singing the song");
    }


}
