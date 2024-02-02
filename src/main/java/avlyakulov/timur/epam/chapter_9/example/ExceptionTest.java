package avlyakulov.timur.epam.chapter_9.example;

import java.io.IOException;


public class ExceptionTest {
    public static void doSomething () throws IOException {

    }
    public static void doSomething (int a) throws NegativeArraySizeException {
        int[] arr = new int[a];
    }


    public static void main(String[] args) {
        /*try {
            int[] a = new int[2];
            System.out.println(a[19]);
        }
        finally {
            System.out.println("Block finally"); // блок finally выполнится в любом случае даже если будет выкинут unchecked exception
        }*/



        try {
            throw new RuntimeException();
        } catch (Exception e) {
            if (e instanceof RuntimeException) { //мы бросили RuntimeException и оно неявно преобразовало, наш Exception в RuntimeException:(RuntimeException) Exception
                RuntimeException re = (RuntimeException) e;
                System.err.println("Это RuntimeException на самом деле!!!");
            } else {
                System.err.print("В каком смысле не RuntimeException???");
            }
        }
        try {
            System.out.println("1");
            try {
                int a = -1;
                int[] arr = new int[a];
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                try {
                    throw new RuntimeException();
                } catch (RuntimeException err) {
                    System.out.println(err.getMessage());
                }
            }
        } catch (NegativeArraySizeException e) {
            System.err.println("Мы вышли за пределы массива ");
        }


        try {
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e) {
            System.err.println("We have exception and we handle the exception ");
        }
        System.out.println("We are here and our program work");

        System.out.println("Секция throws checked and unchecked exceptions");
        try {
            doSomething();
        } catch (IOException e) {

        }
        try {
            doSomething(-3);
        }
        catch (NegativeArraySizeException e) {

        }
    }
}
