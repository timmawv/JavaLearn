package avlyakulov.timur.tp;

public class Main {
    public static void main(String[] args) {
        long start = Runtime.getRuntime().freeMemory();
        long m = System.currentTimeMillis();
        double result = Degree.toDegree();
        Degree.printNumber(result);
        System.out.println((double) (System.currentTimeMillis() - m));
        long end = Runtime.getRuntime().freeMemory();
        long memoTaken = start - end;
        System.out.println(memoTaken);
    }
}
