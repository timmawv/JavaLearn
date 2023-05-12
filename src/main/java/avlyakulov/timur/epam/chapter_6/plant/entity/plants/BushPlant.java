package avlyakulov.timur.epam.chapter_6.plant.entity.plants;

import avlyakulov.timur.epam.chapter_6.plant.entity.TypeOfPlant;

public class BushPlant extends Plant{
    public BushPlant (String information) {
        super(information);
        waterLevel = 10;
        typeOfPlant = TypeOfPlant.BUSHPLANT;
    }

    @Override
    public String toString() {
        return "BushPlant{" +
                "typeOfPlant=" + typeOfPlant +
                ", waterLevel=" + waterLevel +
                "} " + super.toString();
    }
}