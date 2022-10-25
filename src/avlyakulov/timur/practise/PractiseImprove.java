package avlyakulov.timur.practise;

public class PractiseImprove extends Practise {

    public PractiseImprove (int id, String name) {
        super(id,name);
    }
    @Override
    public String toString () {
        return this.getClass().getName() + " : " + "sdklfjasdflksad";
    }

    public static void main(String[] args) {
        PractiseImprove practiseImprove = new PractiseImprove(1,"Nik");
        System.out.println(practiseImprove);
    }
}