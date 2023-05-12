package avlyakulov.timur.epam.chapter_11.example.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jeans", 40);
        map.put("T-Shirt", 35);
        map.put("Gloves", 42);
        map.compute("Shoes", (k, v) -> 77); //adding a pair
        System.out.println(map);
        //replacing value if key is exists
        map.computeIfPresent("Shoes", (k, v) -> v + k.length());
        System.out.println(map);
        map.computeIfAbsent("Shoes", v -> 11);
        //adding a pair if the key is missing
        map.computeIfAbsent("Shoes_2", v -> 11);
        System.out.println(map);

    }
}