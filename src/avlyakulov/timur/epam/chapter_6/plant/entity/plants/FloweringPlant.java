package avlyakulov.timur.epam.chapter_6.plant.entity.plants;

import avlyakulov.timur.epam.chapter_6.plant.entity.TypeOfPlant;

public class FloweringPlant extends Plant {
    public FloweringPlant (String information) {
        super(information);
        waterLevel = 5;
        typeOfPlant = TypeOfPlant.FLOWERINGPLANT;
    }

    @Override
    public String toString() {
        return "FloweringPlant{" +
                "typeOfPlant=" + typeOfPlant +
                ", waterLevel=" + waterLevel +
                "} " + super.toString();
    }
}