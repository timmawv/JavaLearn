package avlyakulov.timur.practise;

public class Practise {


    public static void main(String[] args) {
        String test = "simple test";
        StringBuilder stringBuilder = new StringBuilder("simple test");
        test.toLowerCase();
        stringBuilder.reverse();
        System.out.println(test);//значение не изменилось никак
        System.out.println(stringBuilder);//значение изменилось та как stringBuilder mutable object
    }
}