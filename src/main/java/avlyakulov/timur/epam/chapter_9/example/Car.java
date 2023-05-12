package avlyakulov.timur.epam.chapter_9.example;

public class Car {
    private int[] cost;
    private String model;
    public Car (int cost, String model) {
        this.model = model;
        this.cost = new int[cost];
    }

    public static void main(String[] args) {
        Car car = new Car(-2,"Tesla");
        System.out.println(car);
    }
}
