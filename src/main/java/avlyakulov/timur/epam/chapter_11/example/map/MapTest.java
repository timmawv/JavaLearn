package avlyakulov.timur.epam.chapter_11.example.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map <Integer,String> map = new HashMap<>();
        //ложим в нашу мапу значения с ключами
        map.put(1,"Alex");
        map.put(2,"Dima");
        map.put(3,"Timur");
        map.put(4,"Vlada");
        //теперь ложим в существующий элемент, новый эелемент, при этом возращается старый элемент
        System.out.println(map.put(2,"Alena"));
        //создаем новую мапу
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(13,"Kolya");
        //ложим туда значения, и добавляем в старую новые значения
        map.putAll(map1);
        //при удалении мы возвращаем наше значение, которое удалили
        System.out.println(map.remove(13));
        System.out.println(map1);
        System.out.println(map1.containsKey(13));
        Set<Integer> set = map.keySet();
        System.out.println(set);
        System.out.println(map.entrySet());
        System.out.println(map.values());
        map.forEach((k,v) -> System.out.println(k + "-" + v + " "));
    }
}