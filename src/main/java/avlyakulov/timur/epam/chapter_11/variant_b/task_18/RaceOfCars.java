package avlyakulov.timur.epam.chapter_11.variant_b.task_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//На прямой гоночной трассе стоит N автомобилей, для каждого из которых
//известны начальное положение и скорость. Определить, сколько произой-
//дет обгонов.
public class RaceOfCars {
    Map<Integer, Integer> map = new HashMap<>();

    public RaceOfCars() {
        map.put(1, 20);
        map.put(2, 30);
        map.put(3, 10);
        map.put(4, 60);
        map.put(5, 50);
        map.put(6, 40);
    }

    public void countCarOvertaking() {
        int sum = 0;
        for (Map.Entry<Integer, Integer> firstCar : map.entrySet()) {
            int numberCarCurrent = firstCar.getKey();
            int speedCarCurrent = firstCar.getValue();
            int counter = 0;
            for (Map.Entry<Integer, Integer> anotherCar : map.entrySet()) {
                int numberCarAnother = anotherCar.getKey();
                int speedCarAnother = anotherCar.getValue();
                if (numberCarCurrent != numberCarAnother && speedCarCurrent > speedCarAnother) {
                    ++counter;
                }
            }
            System.out.println("Машина под номером " + numberCarCurrent + " сделала столько обгонов " + counter);
            sum += counter;
        }
        System.out.println("Общее число обгонов на гонке равно " + sum);
    }
}