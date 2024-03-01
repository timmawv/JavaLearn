package avlyakulov.timur.practise_tasks.wildcard.numbers;

import java.util.ArrayList;
import java.util.List;

//Напишите метод, который принимает два списка чисел и возвращает список, содержащий все элементы из обоих списков, но только те, которые больше 10.
public class UnionTwoNumbersList {
    public List<? extends Number> unionLists(List<? extends Number> list1, List<? extends Number> list2) {
        List<Number> resultList = new ArrayList<>();
        list1.stream()
                .filter(n -> n.doubleValue() > 10)
                .forEach(n -> resultList.add(n));
        list2.stream()
                .filter(n -> n.doubleValue() > 10)
                .forEach(n -> resultList.add(n));
        return resultList;
    }
}