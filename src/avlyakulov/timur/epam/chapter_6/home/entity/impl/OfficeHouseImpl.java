package avlyakulov.timur.epam.chapter_6.home.entity.impl;

import avlyakulov.timur.epam.chapter_6.home.entity.BaseHouse;

public class OfficeHouseImpl implements BaseHouse {
    private int square;
    private final int numberOfRooms;
    private final int floorOfTheHouse;

    private boolean rentHouse;
    public OfficeHouseImpl (int square, int numberOfRooms, int floorOfTheHouse) {
        this.square = square;
        this.numberOfRooms = numberOfRooms;
        this.floorOfTheHouse = floorOfTheHouse;
        this.rentHouse = false;
    }

    @Override
    public void buildHouse() {
        System.out.println("We are building your office");
    }

    @Override
    public int countPriceForSquareMeter() {
        System.out.println("Count price for square meter");
        return square * 80;
    }

    @Override
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    @Override
    public void increaseSquare(int square) {
        if (square < this.square)
            System.out.println("You can't decrease square of your office");
        else this.square = square;
    }

    @Override
    public void rentHouse() {
        this.rentHouse = true;
    }

    @Override
    public void makeRepair() {
        System.out.println("We are making repair");
    }

    @Override
    public String toString() {
        return "OfficeHouseImpl{" +
                "square=" + square +
                ", numberOfRooms=" + numberOfRooms +
                ", floorOfTheHouse=" + floorOfTheHouse +
                ", rentHouse=" + rentHouse +
                '}';
    }
}
