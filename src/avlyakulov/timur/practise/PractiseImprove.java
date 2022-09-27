package avlyakulov.timur.practise;

import java.util.Random;

public class PractiseImprove extends Practise {
    public PractiseImprove() {
        super();
    }

    @Override
    public void makeAction(int x) {
        System.out.println(x + x);
    }
    public void improveYourPractise () {
        System.out.println("Improving...");
    }
    public  boolean check() {
        return new Random().nextBoolean(); // demo
    }


    public static void main(String[] args) {
        PractiseImprove improve = new PractiseImprove();
        System.out.println(improve.check());
    }
}