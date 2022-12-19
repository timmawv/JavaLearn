package avlyakulov.timur.epam.chapter_6.plant;

import avlyakulov.timur.epam.chapter_6.plant.entity.plants.FloweringPlant;
import avlyakulov.timur.epam.chapter_6.plant.entity.plants.Plant;
import avlyakulov.timur.epam.chapter_6.plant.impl.PlantActionImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PlantController {
    PlantActionImpl plantAction = new PlantActionImpl();
    Plant[] garden;

    public boolean isGardenCreated() {
        if (garden == null) {
            System.out.println("You don't create a garden");
            return false;
        } else return true;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String position;
            runNavigation();
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else crud(reader, position);
                runNavigation();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }

    public void crud(BufferedReader reader, String position) {
        switch (position) {
            case "1" -> {
                if (garden != null)
                    System.out.println("You have created the garden");
                else garden = new Plant[3];
            }
            case "2" -> {
                if (isGardenCreated())
                    setInformationAboutPlant(reader);
            }
            case "3" -> {
                if (isGardenCreated())
                    getInformationAboutPlant(reader);

            }

            case "5" -> {
                if (isGardenCreated())
                    plantAction.waterPlants();
            }


            default -> System.out.println("You have enter the wrong value");
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create garden press 1");
        System.out.println("If you want to set information about plant press 2");
        System.out.println("If you want to get information about plant press 3");
        System.out.println("If you want to water plants press 5");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }

    public void setInformationAboutPlant(BufferedReader reader) {
        try {
            System.out.println("Enter information about plant that you want to set ");
            String information = reader.readLine();
            System.out.println(Arrays.toString(garden));
            System.out.println("Enter the index of element that you want to change ");
            int index = Integer.parseInt(reader.readLine());
            Plant plant = new FloweringPlant(information);
            plantAction.setInformationAboutPlant(plant,index - 1);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }

    public void getInformationAboutPlant (BufferedReader reader) {
        try {
            System.out.println(Arrays.toString(garden));
            System.out.println("Choose from this list plant that you want get information");
            System.out.println("Enter his index");
            int index = Integer.parseInt(reader.readLine());
            plantAction.getInformationAboutPlant(index);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }
}