package avlyakulov.timur.epam.chapter_11.variant_b.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета по
//кругу вычеркивается каждый второй человек, пока не останется один.
//Составить две программы, моделирующие процесс. Одна из программ
//должна использовать класс ArrayList, а вторая — LinkedList. Какая из
//двух программ работает быстрее? Почему?
public class RoundOfPeople {
    public void removeThePersonFromTheCircleArrayList() {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number of people in circle");
            int number = Integer.parseInt(reader.readLine());
            for (int i = 1; i <= number; ++i)
                list.add(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Our list after adding people to circle");
        System.out.println(list);
        while (list.size() != 1) {
            for (int i = 0; i < list.size(); i += 2)
                list.remove(i);
            System.out.println(list);
        }
        System.out.println("Our list after game");
        System.out.println(list);
    }

    public void removeThePersonFromTheCircleLinkedList() {
        List<Integer> list = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number of people in circle");
            int number = Integer.parseInt(reader.readLine());
            for (int i = 1; i <= number; ++i)
                list.add(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Our list after adding people to circle");
        System.out.println(list);
        while (list.size() != 1) {
            for (int i = 0; i < list.size(); i += 2)
                list.remove(i);
            System.out.println(list);
        }
        System.out.println("Our list after game");
        System.out.println(list);
    }

    public static void main(String[] args) {
        System.out.println("ArrayList");
        long millis = System.currentTimeMillis();
        new RoundOfPeople().removeThePersonFromTheCircleArrayList();
        System.out.println("Time of deleting " + (System.currentTimeMillis() - millis));
    }
}