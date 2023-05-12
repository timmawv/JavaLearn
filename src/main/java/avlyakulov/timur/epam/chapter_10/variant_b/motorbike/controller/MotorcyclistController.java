package avlyakulov.timur.epam.chapter_10.variant_b.motorbike.controller;

import avlyakulov.timur.epam.chapter_10.variant_b.motorbike.entity.BaseThing;
import avlyakulov.timur.epam.chapter_10.variant_b.motorbike.entity.Gloves;
import avlyakulov.timur.epam.chapter_10.variant_b.motorbike.entity.Helmet;
import avlyakulov.timur.epam.chapter_10.variant_b.motorbike.entity.Jacket;

import java.io.*;
import java.util.Arrays;

public class MotorcyclistController {
    BaseThing[] equipment = new BaseThing[3];
    File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_b\\motorbike\\controller\\equipment_info.txt");


    public void run() {
        String position;
        runNavigation();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else crud(position, reader);
                runNavigation();
            }
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want add thing to your equipment press 1");
        System.out.println("If you want to print your equipment press 2");
        System.out.println("If you want to write your equipment to file press 3");
        System.out.println("If you want to restore your equipment from file press 4");
        System.out.println("If you want to count price of your equipment press 5");
        System.out.println("If you want to get your equipment sort by weight press 6");
        System.out.println("If you want to finish your program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createThingToYourEquipment(reader);
            case "2" -> printEquipment();
            case "3" -> writeToFileEquipment();
            case "4" -> restoreFromFileYourEquipment();
            case "5" -> countPriceOfYourEquipment();
            case "6" -> sortYourEquipmentByWeight();
            default -> System.out.println("You enter wrong value");
        }
    }

    public void createThingToYourEquipment(BufferedReader reader) {
        try {
            System.out.println("Choose what you want to create\n 1 - Helmet\n 2 - Jacket\n 3 - Gloves");
            String position = reader.readLine();
            BaseThing baseThing;
            switch (position) {
                case "1" -> {
                    if (equipment[0] != null) {
                        System.out.println("You already have helmet!");
                        return;
                    }
                    System.out.println("Введите стоимость шлема ");
                    int cost = Integer.parseInt(reader.readLine());
                    System.out.println("Введите вес шлема ");
                    int weight = Integer.parseInt(reader.readLine());
                    baseThing = new Helmet(cost, weight);
                    equipment[0] = baseThing;
                }
                case "2" -> {
                    if (equipment[1] != null) {
                        System.out.println("You already have jacket!");
                        return;
                    }
                    System.out.println("Введите стоимость куртки ");
                    int cost = Integer.parseInt(reader.readLine());
                    System.out.println("Введите вес куртки ");
                    int weight = Integer.parseInt(reader.readLine());
                    baseThing = new Jacket(cost, weight);
                    equipment[1] = baseThing;
                }
                case "3" -> {
                    if (equipment[2] != null) {
                        System.out.println("You already have gloves!");
                        return;
                    }
                    System.out.println("Введите стоимость перчаток ");
                    int cost = Integer.parseInt(reader.readLine());
                    System.out.println("Введите вес перчаток ");
                    int weight = Integer.parseInt(reader.readLine());
                    baseThing = new Gloves(cost, weight);
                    equipment[2] = baseThing;
                }
                default -> System.out.println("You enter the wrong value");
            }

        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
    }

    public void printEquipment() {
        for (BaseThing b : equipment) {
            if (b == null)
                System.out.println("Вы еще не приобрели оснащение");
            else System.out.println(b);
        }
    }

    public void writeToFileEquipment() {
        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file))) {
            writer.writeObject(equipment);
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
    }

    public void restoreFromFileYourEquipment() {
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))) {
            equipment = (BaseThing[]) reader.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Exception", e);
        }
    }
    public void countPriceOfYourEquipment() {
        int sum = Arrays.stream(equipment)
                .mapToInt(BaseThing::getCost)
                .sum();
        System.out.println("Сума вашей экипировки " + sum);
    }

    public void sortYourEquipmentByWeight() {
        System.out.println("Ваша экипировка отсортированая по весу");
        Arrays.stream(equipment)
                .sorted((b1, b2) -> b1.getWeight() - b2.getWeight())
                .forEach(System.out::println);
    }
}