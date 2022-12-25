package avlyakulov.timur.epam.chapter_6.computer.entity;

/*
Компьютер. Возможности: создать новую модель компьютера; установить
цену; добавить объем оперативной памяти; изменить разрешение экрана;
изменить процессор компьютера; добавить новые комплектующие в базо-
вую комплектацию. Добавить специализированные методы для Computer,
SmartPhone, Pad.
 */
public class Computer {
    private int price;
    private int ram;
    private int screenResolution;
    private String processor;

    public Computer (int price, int ram, int screenResolution, String processor) {
        this.price = price;
        this.ram = ram;
        this.screenResolution = screenResolution;
        this.processor = processor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(int screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", ram=" + ram +
                ", screenResolution='" + screenResolution + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}