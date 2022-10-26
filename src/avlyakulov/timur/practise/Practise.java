package avlyakulov.timur.practise;

public class Practise {
    class PractiseInner {
        private int num = 0;
    }



    public static void main(String[] args) {
        Practise practise = new Practise();
        Practise.PractiseInner practiseInner = practise.new PractiseInner();
        ++practiseInner.num;
        System.out.println(practiseInner.num);

    }
}
