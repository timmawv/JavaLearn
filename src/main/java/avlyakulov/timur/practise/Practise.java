package avlyakulov.timur.practise;


public class Practise {

    public boolean isSameAfterReversals(int num) {
        StringBuilder str = new StringBuilder(String.valueOf(num));
        String numRes = String.valueOf(str.reverse());
        String strReverse = String.valueOf(new StringBuilder(String.valueOf(Integer.parseInt(String.valueOf(str)))));
        return numRes.equals(strReverse);
    }

    public static void main(String[] args) {
        int num = 625;
        System.out.println(new Practise().isSameAfterReversals(num));
    }
}