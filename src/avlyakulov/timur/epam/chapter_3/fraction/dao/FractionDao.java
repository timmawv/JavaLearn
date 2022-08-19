package avlyakulov.timur.epam.chapter_3.fraction.dao;

import avlyakulov.timur.epam.chapter_3.fraction.db.FractionDB;
import avlyakulov.timur.epam.chapter_3.fraction.entity.Fraction;

public class FractionDao {
    public void addToFraction (Fraction fraction) {
        FractionDB.getInstance().addToFractions(fraction);
    }
    public Fraction[] findAll () {
        return FractionDB.getInstance().findAll();
    }
}
