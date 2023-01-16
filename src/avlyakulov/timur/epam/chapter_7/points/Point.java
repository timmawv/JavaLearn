package avlyakulov.timur.epam.chapter_7.points;

import java.util.Objects;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int[] ints) {
        this.x = ints[0];
        this.y = ints[1];
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int getDistanceFromOrigin() {
        return x + y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" + x + ":" +
                y + '}';
    }
}