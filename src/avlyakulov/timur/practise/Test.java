package avlyakulov.timur.practise;

public interface Test {
    static void eat() {
        System.out.println("Eat something");
    }
     default void swim() {
        System.out.println("Плыви!");
    }
    void go();

}
