package avlyakulov.timur.practise;

public class Main{

    public static void main(String[] args) {
        RecordImutable recordImutable = new RecordImutable("Tim",12);
        System.out.println(recordImutable.name());
        System.out.println(recordImutable);
    }
}