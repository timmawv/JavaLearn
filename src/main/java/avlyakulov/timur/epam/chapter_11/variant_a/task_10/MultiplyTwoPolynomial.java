package avlyakulov.timur.epam.chapter_11.variant_a.task_10;

import java.util.ArrayList;
import java.util.List;

//Умножить два многочлена заданной степени, если коэффициенты многочленов хранятся в различных списках.
public class MultiplyTwoPolynomial {
    public void multiplyPolynomial() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(6);
        list1.add(7);
        List<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(12);
        list2.add(25);
        list2.add(68);
        System.out.print("List 1");
        printPolynomialAsList(list1);
        System.out.print("List 2");
        printPolynomialAsList(list2);
    }
    public void printPolynomialAsList (List<Integer> list) {
        list.forEach(System.out::println);
    }
}