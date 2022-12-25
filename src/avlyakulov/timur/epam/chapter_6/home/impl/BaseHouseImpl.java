package avlyakulov.timur.epam.chapter_6.home.impl;
import avlyakulov.timur.epam.chapter_6.home.BaseHouse;

/*
Дом. Возможности: построить дом; рассчитать цену за квадратный метр;
узнать сколько комнат; увеличить площадь; сдавать дом в аренду; сделать
ремонт (в какой-либо комнате). Добавить специализированные методы для
Дома, Офисного здания, Торгового центра.
 */

public class BaseHouseImpl implements BaseHouse {
    private int square;
    private final int numberOfRooms;
    private final int floorOfTheHouse;

    private boolean rentHouse;

    public BaseHouseImpl (int square, int numberOfRooms, int floorOfTheHouse) {
        this.square = square;
        this.numberOfRooms = numberOfRooms;
        this.floorOfTheHouse = floorOfTheHouse;
        this.rentHouse = false;
    }

    @Override
    public void buildHouse() {
        System.out.println("We are building your house");
    }

    @Override
    public int countPriceForSquareMeter() {
        System.out.println("Count price for square meter");
        return square * 100;
    }

    @Override
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    @Override
    public void increaseSquare(int square) {
        if (square < this.square)
            System.out.println("You can't decrease square of your house");
        else this.square = square;
    }

    @Override
    public void rentHouse() {
        System.out.println("You start to rent your house");
        this.rentHouse = true;
    }

    @Override
    public void makeRepair() {
        System.out.println("We are making repair");
    }
    @Override
    public int getSquare () {
        return square;
    }

    @Override
    public String toString() {
        return "BaseHouseImpl{" +
                "square=" + square +
                ", numberOfRooms=" + numberOfRooms +
                ", floorOfTheHouse=" + floorOfTheHouse +
                ", rentHouse=" + rentHouse +
                '}';
    }
}
