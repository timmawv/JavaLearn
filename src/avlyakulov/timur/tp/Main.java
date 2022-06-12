package avlyakulov.timur.tp;

public class Main {
    public static void main(String[] args) {
        long start = Runtime.getRuntime().freeMemory();
        long m = System.currentTimeMillis();
        double result = Degree.toDegree(8,4,4086);
        Degree.printNumber(result);
        System.out.println();
        System.out.print("Часу затрачено ");
        System.out.println((double) (System.currentTimeMillis() - m));
        long end = Runtime.getRuntime().freeMemory();
        long memoTaken = start - end;
        System.out.print("Памяті затрачено ");
        System.out.println(memoTaken);
    }
}