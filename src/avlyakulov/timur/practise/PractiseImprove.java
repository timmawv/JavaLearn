package avlyakulov.timur.practise;

public class PractiseImprove extends Practise {

    public PractiseImprove () {
        System.out.println("PractiseImprove");
    }
    @Override
    public String toString () {
        return this.getClass().getName() + " : " + "sdklfjasdflksad";
    }

    public static void main(String[] args) {
        PractiseImprove practiseImprove = new PractiseImprove();
        System.out.println(practiseImprove);
    }
}