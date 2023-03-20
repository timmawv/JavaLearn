package avlyakulov.timur.epam.chapter_11.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map <Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Alex");
        map.put(2,"Dima");
        map.put(3,"Timur");
        map.put(4,"Vlada");
        System.out.println(map.put(2,"Alena"));
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(13,"Kolya");
        map.putAll(map1);
        System.out.println(map.remove(13));
        System.out.println(map1);
        System.out.println(map1.containsKey(13));
    }
}