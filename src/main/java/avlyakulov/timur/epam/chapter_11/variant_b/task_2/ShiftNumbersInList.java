package avlyakulov.timur.epam.chapter_11.variant_b.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Задан список целых чисел и некоторое число X. Не используя вспомога-
//тельных объектов и методов сортировки и не изменяя размера списка, пе-
//реставить элементы списка так, чтобы сначала шли числа, не превосходя-
//щие X, а затем числа, больше X.
public class ShiftNumbersInList {
    public void shiftNumbersInList() {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(2);
        list.add(18);
        list.add(5);
        list.add(50);
        list.add(120);
        list.add(3);
        list.add(6);
        list.add(7);
        System.out.println(list);
        int number;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число Х");
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) < number) {
                int temp = list.get(i);
                list.remove(i);
                list.add(0, temp);
            }
        }
        System.out.println("Our list after shift");
        System.out.println(list);
    }
}