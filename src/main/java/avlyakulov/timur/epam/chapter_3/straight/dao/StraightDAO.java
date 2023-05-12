package avlyakulov.timur.epam.chapter_3.straight.dao;

import avlyakulov.timur.epam.chapter_3.straight.entity.Straight;
import avlyakulov.timur.epam.chapter_3.straight.db.StraightDB;

public class StraightDAO {

    public void createStraight(Straight straight) {
        StraightDB.getInstance().createStraight(straight);
    }

    public double[] findPointsOfIntersectionWithTheAxes(Straight straight) {
        return StraightDB.getInstance().findPointsOfIntersectionWithTheAxes(straight);
    }

    public double[] findPointsOfIntersectionStraights(Straight straight, Straight straight1) {
        return StraightDB.getInstance().findIntersectionStraights(straight, straight1);
    }

    public Straight[] findAll() {
        return StraightDB.getInstance().findAll();
    }
}