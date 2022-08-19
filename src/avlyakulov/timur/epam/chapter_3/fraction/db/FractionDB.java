package avlyakulov.timur.epam.chapter_3.fraction.db;

import avlyakulov.timur.epam.chapter_3.fraction.entity.Fraction;


public class FractionDB {
    private final Fraction [] fractions;
    private int current;
    private static FractionDB instance;

    public static FractionDB getInstance () {
        if (instance == null)
            instance = new FractionDB();
        return instance;
    }

    private FractionDB () {
        fractions = new Fraction[10];
    }
    public void addToFractions (Fraction fraction) {
        fractions[current] = fraction;
        ++current;
    }
    public Fraction[] findAll () {
        return fractions;
    }
}