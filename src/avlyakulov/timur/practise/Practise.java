package avlyakulov.timur.practise;

public class Practise {
    private int x;

    public Practise() {
        this (5);
        System.out.println("Default without param");
    }

    public Practise(int x) {
        this.x = x;
        System.out.println("With parameters");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void makeAction(int x) {
        System.out.println(x);
    }
}