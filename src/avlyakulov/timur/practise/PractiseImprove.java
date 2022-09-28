package avlyakulov.timur.practise;

import java.util.Random;

public class PractiseImprove extends Practise {
    public PractiseImprove () {
        super(12);
        System.out.println("Practise improve");
    }
    public static void main(String[] args) {
        PractiseImprove improve = new PractiseImprove();
        System.out.println(improve.getX());
    }
}