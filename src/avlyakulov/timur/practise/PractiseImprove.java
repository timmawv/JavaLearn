package avlyakulov.timur.practise;

public class PractiseImprove extends Practise {

    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        String s3 = new String(s1);
        String s4 = "Java";
        System.out.println(s2 == s4);
        System.out.println(s2.equals(s1));
    }
}