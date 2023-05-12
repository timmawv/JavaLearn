package avlyakulov.timur.practise;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Timur");
        map.put(2,"Alex");
        map.put(3,"Dima");
        map.putIfAbsent(4,"Oleg");
        System.out.println(map.get(2));
        map.remove(2);
        System.out.println(map.containsValue("Timur"));
        System.out.println(map.containsKey(1));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map);
        map.put(3,"Denis");//пример перезаписи в наш объект по ключу
        System.out.println(map);
    }
}
