package avlyakulov.timur.epam.chapter_3.car.entity;
/*Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
        Создать массив объектов. Вывести:
        a) список автомобилей заданной марки;
        b) список автомобилей заданной модели, которые эксплуатируются боль-
        ше n лет;
        c) список автомобилей заданного года выпуска, цена которых больше ука-
        занной.*/
public class Car {
    private String id;
    private String mark;
    private String model;
    private int yearRelease;
    private String color;
    private int price;
    private int registrationNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber=" + registrationNumber +
                '}';
    }
}
