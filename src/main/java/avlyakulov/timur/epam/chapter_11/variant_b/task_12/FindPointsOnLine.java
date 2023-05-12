package avlyakulov.timur.epam.chapter_11.variant_b.task_12;

import java.util.HashMap;
import java.util.Map;

//На плоскости задано N точек. Вывести в файл описания всех прямых, кото-
//рые проходят более чем через одну точку из заданных. Для каждой прямой
//указать, через сколько точек она проходит. Использовать класс HashMap.
public class FindPointsOnLine {
    private Map<Point, Integer> map = new HashMap<>();

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}