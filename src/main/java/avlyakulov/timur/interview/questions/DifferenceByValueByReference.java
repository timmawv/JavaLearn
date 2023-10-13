package avlyakulov.timur.interview.questions;

import avlyakulov.timur.interview.collections.arraylist.Car;

public class DifferenceByValueByReference {

    public static void changeByValue(int a) {
        a = a * 20;
        a += 30;
    }

    public static void changeByReference(Car car) {
        car.setSpeed(car.getSpeed() * 2);
    }

    public static void main(String[] args) {
        int a = 20;
        changeByValue(a);
        System.out.println(a);//здесь значение не изменилось, та как при работе с примитивами создается копия примитива
        Car car = new Car(12, 30);
        changeByReference(car);
        System.out.println(car);//здесь значение изменилось, та как при работе с объектами мы по ссылке получаем сам объект
    }
}