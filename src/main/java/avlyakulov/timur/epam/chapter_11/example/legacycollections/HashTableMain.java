package avlyakulov.timur.epam.chapter_11.example.legacycollections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Jeans", 40); // adding a pair
        table.put("T-Shirt", 35);
        table.put("Gloves", 42);
        table.compute("Shoes", (k, v) -> 77); // adding a pair
        System.out.println(table);
        Enumeration<String> keys = table.keys();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
        Enumeration<Integer> values = table.elements();
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }
    }
}