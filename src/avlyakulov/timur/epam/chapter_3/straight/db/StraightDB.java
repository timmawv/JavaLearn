package avlyakulov.timur.epam.chapter_3.straight.db;

import avlyakulov.timur.epam.chapter_3.straight.entity.Straight;

public class StraightDB {
    private static StraightDB instance;
    private Straight[] straights;
    private int current;

    private StraightDB() {
        straights = new Straight[10];
    }

    public static StraightDB getInstance() {
        if (instance == null)
            instance = new StraightDB();
        return instance;
    }


    public void createStraight(Straight straight) {
        if (current == straights.length) {
            Straight[] straights1 = new Straight[straights.length + 1];
            System.arraycopy(straights, 0, straights1, 0, straights.length);
            straights = straights1;
        }
        straights[current] = straight;
        current++;
    }

    public double[] findPointsOfIntersectionWithTheAxes(Straight straight) {
        double intersectionX = 1 / straight.getFraction().getA();
        double intersectionY = 1 / straight.getFraction().getB();
        return new double[]{intersectionX, intersectionY};
    }

    public double[] findIntersectionStraights(Straight straight, Straight straight1) {
        double a = straight.getFraction().getA() + straight1.getFraction().getA();
        double b = straight.getFraction().getB() + straight1.getFraction().getB();
        double c = 2;
        if (a == 0 && b == 0) {
            System.out.println("Our straights are parallel");
            return null;
        }
        else if (a == 0 || b == 0) {
            System.out.println("Our straights match");
            return null;
        }
        else
            return new double[] {c/a,c/b};
    }

    public Straight[] findAll() {
        return straights;
    }
}
