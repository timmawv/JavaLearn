package avlyakulov.timur.epam.chapter_6.plant.impl;

import avlyakulov.timur.epam.chapter_6.plant.entity.PlantAction;
import avlyakulov.timur.epam.chapter_6.plant.entity.plants.Plant;

public class PlantActionImpl implements PlantAction {

    Plant[] garden;
    @Override
    public void setInformationAboutPlant(Plant plant,int index) {
        garden[index] = plant;
    }

    @Override
    public Plant getInformationAboutPlant(int index) {
        return garden[index];
    }

    @Override
    public void addNewTypeOfPlant(Plant plant,int index) {
        if (index == garden.length) {
            Plant[] garden1 = new Plant[garden.length + 1];
            System.arraycopy(garden, 0, garden1,0,garden.length);
            garden = garden1;
        }
        for (int i = index; i < garden.length; ++i) {
            Plant plant1 = garden[i];
            garden[i] = plant;
            garden[i + 1] = plant1;
        }
    }

    @Override
    public void waterPlants() {
        System.out.println("We watering our garden and increase the level of water of our plants");

    }

    @Override
    public void removePlant(int index) {
        garden[index] = null;
        for (int i = index; i < garden.length; ++i) {
            Plant plant = garden[index + 1];
            garden[index] = plant;
            garden[index + 1] = null;
        }
    }
}
