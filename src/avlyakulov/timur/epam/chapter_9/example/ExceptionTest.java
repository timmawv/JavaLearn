package avlyakulov.timur.epam.chapter_9.example;

import avlyakulov.timur.practise.Practise;
import avlyakulov.timur.practise.PractiseImprove;

public class ExceptionTest {
    public static void main(String[] args) {
        /*try {
            int[] a = new int[2];
            System.out.println(a[19]);
        }
        finally {
            System.out.println("Block finally"); // блок finally выполнится в любом случае даже если будет выкинут unchecked exception
        }*/
        Practise practise = new Practise();
        if (practise instanceof PractiseImprove) // сюда надо вставлять нащадка, какого то класса и сам класс: true (если наш класса предок) , false(если не предок)
            System.out.println("true");
        else System.out.println("false");


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
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true)
                    throw new Exception();

                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // не заходим - выполнение НЕ в норме
        } catch (Exception e) {
            System.err.print(" 6");     // ЗАХОДИМ - есть подходящее исключение
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
    }
}
