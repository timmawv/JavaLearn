package avlyakulov.timur.epam.chapter_4.puppy.entity;

/*
Создать объект класса Щенок, используя классы Животное, Собака.
Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
 */
public class Puppy extends Dog {
    private String name;
    public Puppy (String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("The name of puppy is " + name);
    }

    @Override
    public void barking() {
        System.out.println("the puppy is barking :)");
    }

    @Override
    public void jumping() {
        System.out.println("The puppy is jumping like cute");
    }

    @Override
    public void biting() {
        System.out.println("small puppy biting you");
    }

    @Override
    public void running() {
        System.out.println("Look small cute puppy running");
    }
}