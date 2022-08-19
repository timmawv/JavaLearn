package avlyakulov.timur.epam.chapter_3.fraction.service;

import avlyakulov.timur.epam.chapter_3.fraction.dao.FractionDao;
import avlyakulov.timur.epam.chapter_3.fraction.entity.Fraction;

public class FractionService {
    private final FractionDao fractionDao = new FractionDao();

    public void addToFractions (Fraction fraction) {
        fractionDao.addToFraction(fraction);
    }
    public Fraction[] findAll () {
        return fractionDao.findAll();
    }
}