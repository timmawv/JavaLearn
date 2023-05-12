package avlyakulov.timur.epam.chapter_3.fraction.dao;

import avlyakulov.timur.epam.chapter_3.fraction.entity.Fraction;
import avlyakulov.timur.epam.chapter_3.fraction.db.FractionDB;

public class FractionDao {
    public void addToFraction (Fraction fraction) {
        FractionDB.getInstance().addToFractions(fraction);
    }
    public Fraction[] findAll () {
        return FractionDB.getInstance().findAll();
    }
}
