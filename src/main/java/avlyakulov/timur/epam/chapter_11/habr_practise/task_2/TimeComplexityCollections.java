package avlyakulov.timur.epam.chapter_11.habr_practise.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//Напишите метод, который добавляет 1_000_000 элементов в ArrayList и LinkedList.
//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
//Замерьте время, которое потрачено на это.
//Сравните результаты и предположите, почему они именно такие.
public class TimeComplexityCollections {
    public static void countTimeLists() {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long currentArrayList = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; ++i) {
            arrList.add(i);
        }
        System.out.println("Время потраченое на добавление ArrayList 1_000_000 элементов " + (System.currentTimeMillis() - currentArrayList));
        long currentLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; ++i) {
            linkedList.add(i);
        }
        System.out.println("Время потраченое на добавление LinkedList 1_000_000 элементов " + (System.currentTimeMillis() - currentLinkedList));
        currentArrayList = System.currentTimeMillis();
        for (int i = 0; i < 100_000; ++i) {
            Random random = new Random();
            arrList.remove(random.nextInt(0, 100_000));
        }
        System.out.println("Время потраченое на удаление ArrayList 1_000_000 случайных элементов равно " + (System.currentTimeMillis() - currentArrayList));
        currentLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100_000; ++i) {
            Random random = new Random();
            linkedList.remove(random.nextInt(0, 100_000));
        }
        System.out.println("Время потраченое на удаление LinkedList 1_000_000 случайных элементов равно " + (System.currentTimeMillis() - currentArrayList));
    }

    public static void main(String[] args) {
        countTimeLists();
    }
}