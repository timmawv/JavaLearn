package avlyakulov.timur.epam.chapter_10.variant_b.car.entity;

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

    public Car(int cost) {
        this.cost = cost;
        this.fuelConsumption = (int) (Math.random() * 3 + 1);
        this.speed = (int) (Math.random() * 10 + 5) * 10;
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

    public int getCode() {
        return code;
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