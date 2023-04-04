package avlyakulov.timur.epam.chapter_11.variant_a.task_9;

//Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в объекте HashMap
//степень многочлена наш ключ, значение коэфициент при многочлене

import java.util.HashMap;
import java.util.Map;

public class AddingTwoPolynomial {
    public void addingTwoPolynomial() {
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 2);
        map1.put(2, 2);
        map1.put(3, 12);
        map1.put(5, 10);
        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(1, 7);
        map2.put(2, 5);
        map2.put(3, 3);
        map2.put(4, 12);
        printPolynomial(map1);
        printPolynomial(map2);
        Map<Integer, Integer> resultMap = new HashMap<>();
        int maxDegreeFirstMap = map1.entrySet()
                .stream()
                .max((m1, m2) -> m1.getKey() - m2.getKey())
                .get().getKey();
        int maxDegreeSecondMap = map2.entrySet()
                .stream()
                .max((m1, m2) -> m1.getKey() - m2.getKey())
                .get().getKey();
        int maxDegree = Math.max(maxDegreeFirstMap, maxDegreeSecondMap);
        System.out.println(maxDegree);
        for (int i = 1; i <= maxDegree; ++i) {
            if (map1.containsKey(i) && map2.containsKey(i))
                resultMap.put(i, map1.get(i) + map2.get(i));
            else if (map1.containsKey(i) && !map2.containsKey(i)) {
                resultMap.put(i, map1.get(i));
            } else {
                resultMap.put(i, map2.get(i));
            }
        }
        System.out.print("Результат сложения 2-х многочленов ");
        printPolynomial(resultMap);
    }

    public void printPolynomial(Map<Integer, Integer> map) {
        map.forEach((key, value) -> System.out.print(value + "x^" + key + " + "));
        System.out.println();
    }
}