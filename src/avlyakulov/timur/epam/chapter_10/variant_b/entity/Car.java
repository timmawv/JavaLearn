package avlyakulov.timur.epam.chapter_10.variant_b.entity;

import java.io.Serializable;

/*
Определить иерархию легковых автомобилей. Создать таксопарк. Подсчитать стоимость автопарка. Провести сортировку автомобилей
парка по расходу топлива. Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости
*/
public class Car implements Serializable {
    private int cost;
    private int fuelConsumption;
    private int speed;
    private transient int code;

    public Car(int cost, int fuelConsumption, int speed) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        code = (int) (Math.random() * 100 + 32);
    }

    public int getCost() {
        return cost;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cost=" + cost +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", code=" + code +
                '}';
    }
}