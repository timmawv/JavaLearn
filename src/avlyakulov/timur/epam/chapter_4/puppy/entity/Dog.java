package avlyakulov.timur.epam.chapter_4.puppy.entity;

public class Dog extends Animal{
    private String name;
    public Dog (String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("The name of dog is " + name);
    }
    public void barking () {
        System.out.println("The dog barking...");
    }
    public void jumping () {
        System.out.println("The dog is jumping");
    }
    public void biting() {
        System.out.println("The dog is biting");
    }
    public void running() {
        System.out.println("The dog is running");
    }
}
