package avlyakulov.timur.book.chapter_2.numbers;

import java.util.Scanner;

//Написать код программы, которая бы переводила числа из десятичной системы счисления в любую другую.
public class NumberSystemTranslation {
    public static void translationNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number ");
        int number = in.nextInt();
        System.out.println("Choose System Translation");
        System.out.print(" 1 - двоичная " + " 2 - восьмеричная" + " 3 - шестнадцатеричная");
        System.out.println();
        System.out.print("Enter choose ");
        int chooseSystem = in.nextInt();
        switch (chooseSystem) {
            case 1 -> {
                System.out.println("2");
                System.out.println(Integer.toBinaryString(number));
            }
            case 2 -> {
                System.out.println("8");
                System.out.println(Integer.toOctalString(number));
            }
            case 3 ->{
                System.out.println("16");
                System.out.println(Integer.toHexString(number));
            }
            default -> System.out.println("You choose wrong number");
        }
    }
}
