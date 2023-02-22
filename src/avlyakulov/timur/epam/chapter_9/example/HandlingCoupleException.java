package avlyakulov.timur.epam.chapter_9.example;

public class HandlingCoupleException {
    public static void main(String[] args) {
        try {
            int a = (int) (Math.random() * 2);
            System.out.println("a = " + a);
            int[] c = {1 / a};// place of occurrence of exception #1
            c[a] = 71; // place of occurrence of exception #2
        }
        catch (ArithmeticException e) {
            System.err.println("divided by zero " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("out of bound: " + e);
        }  //end try-catch block
        System.out.println("After try-catch block");
    }
}