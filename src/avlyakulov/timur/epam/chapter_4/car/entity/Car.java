package avlyakulov.timur.epam.chapter_4.car.entity;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
Идеи заранее : в двигателе храним количество бениза
колесо ломается в случайный промежуток времени, создаем рандом, 1 позедка 1 кюрент увеличиваем и когда кюрент равно рандом ломаем колесо,
 */
public class Car extends Engine {
    Wheel wheel;
    String model;

    public Car(String model) {
        wheel = new Wheel();
        this.model = model;
        System.out.println("Your fuel is " + getFuel());
        System.out.println("Your condition of wheel is " + wheel.getCondition());
    }


    public void drive() {
            if (wheel.getCondition() == 0)
                System.out.println("You can't drive because your wheel is broke please change him");
            else if (getFuel() == 0)
                System.out.println("You ran out of gas, please refuel your car");
            else {
                System.out.println("Car is driving...");
                int fuel = getFuel();
                setFuel(--fuel);
                int condition = wheel.getCondition();
                wheel.setCondition(--condition);
                System.out.println("Your state of car after driving\n" +
                        "Fuel - " + fuel + "\n" +
                        "Wheel - " + wheel.getCondition());
            }
    }

    @Override
    public void refuel() {
        System.out.println("Car is refueling...");
        setFuel(3);
        System.out.println("Your fuel is " + getFuel());
    }

    public void changeWheel() {
        System.out.println("Wheel is changing...");
        wheel.setCondition(5);
        System.out.println("Your condition of wheel is " + wheel.getCondition());
    }

    public void printCarModel() {
        System.out.println("Car model is " + model);
    }
}