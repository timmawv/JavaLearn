package avlyakulov.timur.practise;


public class Practise {

    public boolean squareIsWhite(String coordinates) {
        char n = coordinates.charAt(0);
        int num = n - 96;
        int pos = coordinates.charAt(1) - 48;
        if (num % 2 == 0) {
            return pos % 2 != 0;
        } else {
            return pos % 2 == 0;
        }
    }

    public static void main(String[] args) {
        String coordinates = "c1";
        int pos = coordinates.charAt(1) - 48;
        System.out.println(pos);
    }
}