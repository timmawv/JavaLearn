package avlyakulov.timur.epam.chapter_11.example.enumset;

import java.util.EnumSet;
import static avlyakulov.timur.epam.chapter_11.example.enumset.Country.*;

public class EnumSetTest {
    public static void main(String[] args) {
        //мы создали уже пустой сет, с указаным типом enum, то есть туда уже кроме нашего enum уже положить ничего нельзя
        //EnumSet<Country> countries = EnumSet.noneOf(Country.class);
        //мы создаем полный сет, все наших значений
        //EnumSet<Country> countries = EnumSet.allOf(Country.class);
        EnumSet<Country> countries = EnumSet.of(UKRAINE,POLAND,USA);
        EnumSet<Country> countriesComplement = EnumSet.complementOf(countries); // создали сет всех значений которых нет в том
        EnumSet<Country> countriesRange = EnumSet.range(ARMENIA,UKRAINE);
        System.out.println(countriesRange);

    }
}

enum Cities {
    KIEV, KHARKIV, SUMY
}