package avlyakulov.timur.epam.chapter_7.points;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Создать N пар значений x, y, которые представляют координаты точки на плоскости.
Выстроить все точки по увеличению их удаленности от начала координат,
 и вывести отсортированный список точек на экран в формате: (X:Y).
 */
public class CouplePoint {
    public static void main(String[] args) {
        CouplePoint couplePoint = new CouplePoint();
        Point[] points = new Point[3];
        couplePoint.fillPoints(points);
        System.out.println(Arrays.stream(points).sorted((p1, p2) -> p1.getDistanceFromOrigin() - p2.getDistanceFromOrigin()).collect(Collectors.toList()));
    }

    public Point getPoint(int... points) {
        Function<int[], Point> point = Point::new;
        return point.apply(points);
    }

    public void fillPoints(Point[] points) {
        int i = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (i < points.length) {
                System.out.println("Creating point number " + (i + 1));
                System.out.println("Enter x");
                int x = Integer.parseInt(reader.readLine());
                System.out.println("Enter y");
                int y = Integer.parseInt(reader.readLine());
                points[i] = getPoint(x, y);
                ++i;
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}