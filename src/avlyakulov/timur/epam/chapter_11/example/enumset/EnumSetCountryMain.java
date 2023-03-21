package avlyakulov.timur.epam.chapter_11.example.enumset;

import java.util.EnumSet;

import static avlyakulov.timur.epam.chapter_11.example.enumset.Country.*;

public class EnumSetCountryMain {
    public static void main(String[] args) {
        //пример работы с EnumSet
        EnumSet<Country> asiaCountries = EnumSet.of(ARMENIA, INDIA, KAZAKHSTAN);
        String nameCountry = "Ukraine";
        Country current = Country.valueOf(nameCountry.toUpperCase());
        if (asiaCountries.contains(current))
            System.out.println(current + " is in Asia");
        else
            System.out.println(current + " is not in Asia");
        System.out.println("EnumSet");

    }
}