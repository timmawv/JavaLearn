package avlyakulov.timur.epam.chapter_11.example.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapEntryMain {
    public static void main(String[] args) {
        //создание хэш-карты и замена элемента по ключу
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Пряник", 5);
        hashMap.put("Кефир", 1);
        hashMap.put("Хлеб", 1);
        //изменение не произойдет та как у нас уже есть хлеб и не куда ставить наше значение
        hashMap.putIfAbsent("Хлеб", 2);
        hashMap.putIfAbsent("Молоко", 5);
        hashMap.computeIfAbsent("Сырок", v -> 3); // добавляем пару, та как такого ключа как сырок у нас нет
        hashMap.computeIfPresent("Сырок", (k, v) -> 4); //заменяем наше значение на на 4 та как такой ключ существует.
        hashMap.computeIfAbsent("Сырок", v -> 144); // изменение не произойдет та как у нас существует такой элемент
        System.out.println(hashMap);
        hashMap.put("Пряник", 4); //меняем значения для нашего ключа, который уже существует
        System.out.println("After replacing element");
        System.out.println(hashMap);
        System.out.println(hashMap.get("Хлеб") + " found value by key 'Хлеб'");
        System.out.println("Map.Entry example ");
        Set<Map.Entry<String,Integer>> entrySet = hashMap.entrySet();
        System.out.println(entrySet);
        entrySet.forEach(e-> System.out.println(e.getKey() + " : " + e.getValue()));
        Set<Integer> values = new HashSet<>(hashMap.values()); // не бывает повторений
        System.out.println(values);
    }
}