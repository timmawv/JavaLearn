package avlyakulov.timur.practise;

public class Practise {
    private int x;
    public Practise (int x) {
        this.x = x;
        System.out.println("Constructor with parameters");
    }
    public Practise () {
        System.out.println("Without parameters");
    }
    public int getX () {
        return this.x;
    }
}