package avlyakulov.timur.epam.chapter_6.train.impl;

import avlyakulov.timur.epam.chapter_6.train.entity.*;

public class CarriageActionImpl extends Carriage implements CarriageAction {

    public CarriageActionImpl (String registrationNumber, Destination destination, Owner owner, Status status) {
        super(registrationNumber,destination,owner,status);
    }
    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void sendToDestination() {

    }

    @Override
    public void repair() {

    }

    @Override
    public Status getStatus() {
        return null;
    }
}