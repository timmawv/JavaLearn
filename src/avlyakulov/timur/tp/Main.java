package avlyakulov.timur.tp;

public class Main {
    public static void main(String[] args) {
        int f = Factorial.fillNumber();
        long m = System.currentTimeMillis();
        System.out.println("Result: " + Factorial.getFactorialStream(f));
        System.out.println();
        System.out.print("Часу затрачено ");
        System.out.println((double) (System.currentTimeMillis() - m));
    }
}