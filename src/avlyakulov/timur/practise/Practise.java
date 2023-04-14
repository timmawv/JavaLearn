package avlyakulov.timur.practise;

public class Practise implements AbleToFly, AbleToSwim {

    @Override
    public void swim() {
        AbleToFly.super.swim();
    }
}

interface AbleToSwim {
    void swim();
}

interface AbleToFly {
    default void swim() {
        System.out.println("Swimming");
    }
}