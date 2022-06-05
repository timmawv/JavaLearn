package avlyakulov.timur.tp;

public class Main {
    public static void main(String[] args) {
        long m = System.currentTimeMillis();
        double result = Degree.toDegree();
        System.out.println((double) (System.currentTimeMillis() - m));
        Degree.printNumber(result);
    }
}
