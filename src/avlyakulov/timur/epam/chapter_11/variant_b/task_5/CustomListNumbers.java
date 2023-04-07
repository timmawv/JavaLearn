package avlyakulov.timur.epam.chapter_11.variant_b.task_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//На базе коллекций реализовать структуру хранения чисел с поддержкой следующих операций:
//• добавление/удаление числа;
//• поиск числа, наиболее близкого к заданному (т.е. модуль разницы минимален).
public class CustomListNumbers {
    private final List<Integer> listNumbers;

    public CustomListNumbers(List<Integer> listNumbers) {
        this.listNumbers = listNumbers;
    }

    public void printListNumber() {
        System.out.println("Our list of Numbers");
        System.out.println(listNumbers);
    }

    public void addNumber(int num) {
        listNumbers.add(num);
        System.out.println("Num - " + num + " was added");
    }

    public void removeNumbers(int num) {
        listNumbers.removeIf(e -> e == num);
        System.out.println("Num - " + num + " was deleted");
    }

    public void findTheClosestNumber(int num) {
        int index = listNumbers.indexOf(num);
        int min = 20;
        int indexOfMinNumber = 0;
        for (int i = 0; i < listNumbers.size(); ++i) {
            if (i != index) {
                if (Math.abs(num - listNumbers.get(i)) < min) {
                    min = Math.abs(num - listNumbers.get(i));
                    indexOfMinNumber = i;
                }
            }
        }
        System.out.println("Наиболее близкое к заданому нами число есть " + listNumbers.get(indexOfMinNumber));
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        CustomListNumbers customListNumbers = new CustomListNumbers(numbers);
        String pos = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                int num = 0;
                customListNumbers.runNavigation();
                System.out.println("Выберите действие которое хотите сделать с коллекцией");
                pos = reader.readLine();
                switch (pos) {
                    case "1" -> {
                        System.out.println("Введите число ");
                        num = Integer.parseInt(reader.readLine());
                        customListNumbers.addNumber(num);
                    }
                    case "2" -> {
                        System.out.println("Введите число ");
                        num = Integer.parseInt(reader.readLine());
                        customListNumbers.removeNumbers(num);
                    }
                    case "3" -> {
                        System.out.println("Введите число ");
                        num = Integer.parseInt(reader.readLine());
                        customListNumbers.findTheClosestNumber(num);
                    }
                    case "4" -> {
                        customListNumbers.printListNumber();
                    }
                    case "0" -> System.exit(0);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to add your number to listNumbers press 1");
        System.out.println("If you want to remove your number from listNumbers press 2");
        System.out.println("If you want to find the closest number in your listNumbers press 3");
        System.out.println("If you want to print you listNumber press 4");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }
}