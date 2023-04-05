package avlyakulov.timur.epam.chapter_11.variant_a.task_16;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
//Заполнить HashMap 10 объектами <Integer, String>. Найти строки у кото-
//рых ключ>5. Если ключ = 0, вывести строки через запятую. Перемножить
//все ключи, где длина строки>5.

public class FilterHashMap {
    public void filterHashMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "car");
        map.put(2, "parfeniuk");
        map.put(3, "string");
        map.put(4, "lover");
        map.put(5, "Ukraine");
        map.put(6, "lot");
        map.put(7, "love");
        map.put(8, "beautiful");
        map.put(9, "amazing");
        map.put(10, "astonishing");
        System.out.println("Our map");
        System.out.println(map);
        System.out.println("Строки у которых ключ больше 5");
        map.entrySet()
                .stream()
                .filter(buck -> buck.getKey() > 5)
                .forEach(System.out::println);
        int result = map.entrySet()
                .stream()
                .filter(buck -> buck.getValue().length() > 5)
                .mapToInt(Map.Entry::getKey)
                .reduce((n1, n2) -> n1 * n2)
                .orElse(0);
        System.out.println("Перемножить все ключи, где длина строки>5.");
        System.out.println(result);
    }
}