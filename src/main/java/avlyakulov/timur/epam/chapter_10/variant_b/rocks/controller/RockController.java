package avlyakulov.timur.epam.chapter_10.variant_b.rocks.controller;

import avlyakulov.timur.epam.chapter_10.variant_b.rocks.entity.Amethyst;
import avlyakulov.timur.epam.chapter_10.variant_b.rocks.entity.Diamond;
import avlyakulov.timur.epam.chapter_10.variant_b.rocks.entity.Rock;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RockController {
    File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_b\\rocks\\controller\\rocks_info.txt");
    List<Rock[]> necklaces = new ArrayList<>();

    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String position;
            runNavigation();
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else
                    crud(position, reader);
                runNavigation();
            }
        } catch (
                IOException e) {
            throw new RuntimeException("Exception ", e);
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create necklace press 1");
        System.out.println("If you want print your collection of necklaces print 2");
        System.out.println("If you want to write your necklaces to file press 3");
        System.out.println("If you want to restore your necklaces from file press 4");
        System.out.println("If you want to count your price and weight of your necklaces press 5");
        System.out.println("If you want to find your rocks in necklaces by transparency press 6");
        System.out.println("If you want to finish your program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createNecklace(reader);
            case "2" -> printNecklaces();
            case "3" -> writeToFileRocks();
            case "4" -> restoreNecklaceFromFile();
            case "5" -> countPriceAndWeight();
            case "6" -> findRocksInNecklaceByTransparency(reader);
            default -> System.out.println("You have enter the wrong value!");
        }
    }

    public void createNecklace(BufferedReader reader) {
        try {
            System.out.println("Введите сколько камней хотите создать не больше 6");
            int counter = Integer.parseInt(reader.readLine());
            if (counter > 6) {
                System.out.println("Вы ввели значение больше 6");
                return;
            }
            int i = 1;
            int numberOfRock = 0;
            Rock[] necklace = new Rock[1];
            while (i <= counter) {
                Rock rock;
                System.out.println("Выберите тип камня который хотите создать 1 диамант или 2 аметист");
                String type = reader.readLine();
                switch (type) {
                    case "1" -> {
                        System.out.println("Введите цену диаманта ");
                        int cost = Integer.parseInt(reader.readLine());
                        System.out.println("Введите прозрачность диаманта в % от 1 до 100 в этом диапазоне");
                        int transparency = fillTransparency(reader);
                        rock = new Diamond(cost, transparency);
                        necklace = addRockToNecklace(necklace, numberOfRock, rock);
                        ++numberOfRock;
                    }
                    case "2" -> {
                        System.out.println("Введите цену аметиста ");
                        int cost = Integer.parseInt(reader.readLine());
                        System.out.println("Введите прозрачность аметиста в % от 1 до 100 в этом диапазоне");
                        int transparency = fillTransparency(reader);
                        rock = new Amethyst(cost, transparency);
                        necklace = addRockToNecklace(necklace, numberOfRock, rock);
                        ++numberOfRock;
                    }
                }
                ++i;
            }
            System.out.println("Ваше ожерелье имеет такой вид\n " + Arrays.toString(necklace));
            necklaces.add(necklace);
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
    }

    public int fillTransparency(BufferedReader reader) {
        int transparency = 0;
        try {
            boolean transparencyCheck = false;
            while (!transparencyCheck) {
                transparency = Integer.parseInt(reader.readLine());
                if (transparency < 0 || transparency > 100) {
                    System.out.println("Вы ввели неправильное значение пожалуйста в следующий раз введите правильное");
                    System.out.println("Введите еще раз ваше значение");
                } else {
                    transparencyCheck = true;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
        return transparency;
    }

    public void printNecklaces() {
        int i = 1;
        for (Rock[] r : necklaces) {
            System.out.printf("Ваше %d ожерелье\n", i);
            for (Rock rock : r)
                System.out.println(rock);
            ++i;
        }
    }

    public void writeToFileRocks() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(necklaces);
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
        System.out.println("Your necklace was written to file");
    }

    public void restoreNecklaceFromFile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            necklaces = (List<Rock[]>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Exception", e);
        }
        System.out.println("Your necklace was restored");
    }

    public void countPriceAndWeight() {
        int i = 1;
        for (Rock[] r : necklaces) {
            int price = Arrays.stream(r)
                    .mapToInt(Rock::getCost)
                    .sum();
            int weight = Arrays.stream(r)
                    .mapToInt(Rock::getWeight)
                    .sum();
            System.out.printf("Ваше %d ожерелье имеет такой вес %d и такую стоимость %d\n", i, weight, price);
            ++i;
        }
    }

    public void findRocksInNecklaceByTransparency(BufferedReader reader) {
        try {
            System.out.println("Введите диапазон от 1 до 100");
            System.out.println("Введите 1 диапазон");
            int firstLimit = Integer.parseInt(reader.readLine());
            System.out.println("Введите 2 диапазон");
            int secondLimit = Integer.parseInt(reader.readLine());
            int i = 1;
            for (Rock[] r : necklaces) {
                System.out.printf("Камни, которые соответсвуют диапазону в %d ожерелье\n", i);
                Arrays.stream(r)
                        .filter(rock -> (rock.getTransparency() > firstLimit && rock.getTransparency() < secondLimit))
                        .forEach(System.out::println);
                ++i;
            }
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
    }

    public Rock[] addRockToNecklace(Rock[] rocks, int numberOfRocks, Rock rock) {
        if (numberOfRocks == rocks.length) {
            Rock[] rocks1 = new Rock[rocks.length + 1];
            System.arraycopy(rocks, 0, rocks1, 0, rocks.length);
            rocks = rocks1;
        }
        rocks[numberOfRocks] = rock;
        return rocks;
    }
}