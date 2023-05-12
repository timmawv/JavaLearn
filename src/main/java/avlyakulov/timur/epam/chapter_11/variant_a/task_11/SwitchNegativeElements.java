package avlyakulov.timur.epam.chapter_11.variant_a.task_11;

import java.util.ArrayList;
import java.util.List;

//Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные — в начало списка.
public class SwitchNegativeElements {
    public void switchNegativeElementsInList() {
        List<Integer> list = new ArrayList<>();
        list.add(-2);
        list.add(-4);
        list.add(-5);
        list.add(-8);
        list.add(12);
        list.add(13);
        list.add(153);
        list.add(123);
        list.add(1366);
        list.add(-22);
        list.add(-72);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());
        for (int x = 0; x < list.size(); ++x)
            for (int i = 0; i < list.size() - 1; ++i) {
                if (list.get(i) < 0) {
                    int num = list.get(i);
                    list.remove(list.get(i));
                    list.add(num);
                }
            }
        System.out.println(list);
    }
}