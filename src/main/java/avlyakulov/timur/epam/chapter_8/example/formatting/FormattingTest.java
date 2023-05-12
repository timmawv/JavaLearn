package avlyakulov.timur.epam.chapter_8.example.formatting;

import java.util.Formatter;

public class FormattingTest {
    public static void main(String[] args) {
        //форматирование букв
        Formatter formatter = new Formatter();
        formatter.format("This %s is about %S %c","book","java",'2');
        System.out.println(formatter);
        //Форматирование чисел с использованием спецификаторов %x, %o, %a, %g:
        formatter = new Formatter();
        formatter.format("Hex: %x, Octal: %o", 100, 100);
        System.out.println(formatter);
        formatter = new Formatter();
        formatter.format("%a", 100.001);
        System.out.println(formatter);
        formatter = new Formatter();
        for (double i = 1000; i < 1.0e+10; i *= 100) {
            formatter.format("%g ", i);
            System.out.println(formatter);
        }
    }
}