package avlyakulov.timur.epam.chapter_6.plant.entity.plants;

import avlyakulov.timur.epam.chapter_6.plant.entity.TypeOfPlant;


public class HousePlant extends Plant {
    public HousePlant(String information) {
        super(information);
        waterLevel = 8;
        typeOfPlant = TypeOfPlant.HOUSEPLANT;
    }

    @Override
    public String toString() {
        return "HousePlant{" +
                "typeOfPlant=" + typeOfPlant +
                ", waterLevel=" + waterLevel +
                "} " + super.toString();
    }
}
