package avlyakulov.timur.epam.chapter_6.train.impl;

import avlyakulov.timur.epam.chapter_6.train.entity.*;

public class CarriageActionImpl extends Carriage implements CarriageAction {

    public CarriageActionImpl (String registrationNumber, Destination destination, Owner owner, Status status) {
        super(registrationNumber,destination,owner,status);
    }
    @Override
    public int getWeight() {
        return 100;
    }

    @Override
    public void sendToDestination() {
        status = Status.WAY;
    }

    @Override
    public void repair() {
        System.out.println("repair");
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "" + super.toString();
    }
}