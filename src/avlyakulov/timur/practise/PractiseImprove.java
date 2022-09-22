package avlyakulov.timur.practise;

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


    public static void main(String[] args) {
        int x = 12;
        Practise practise = new PractiseImprove();
        practise.makeAction(x);

    }
}