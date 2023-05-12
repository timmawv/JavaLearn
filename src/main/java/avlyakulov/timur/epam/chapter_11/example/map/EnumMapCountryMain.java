package avlyakulov.timur.epam.chapter_11.example.map;

import avlyakulov.timur.epam.chapter_11.example.enumset.Country;

import java.util.EnumMap;

public class EnumMapCountryMain {
    public static void main(String[] args) {
        EnumMap<Country, Integer> map = new EnumMap<>(Country.class);
        map.put(Country.POLAND, 8);
        map.put(Country.ARMENIA, 6);
        map.put(Country.GERMANY, 0);
        System.out.println(map);

    }
}
