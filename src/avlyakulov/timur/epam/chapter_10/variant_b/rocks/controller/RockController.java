package avlyakulov.timur.epam.chapter_10.variant_b.rocks.controller;

import avlyakulov.timur.epam.chapter_10.variant_b.rocks.entity.Amethyst;
import avlyakulov.timur.epam.chapter_10.variant_b.rocks.entity.Diamond;
import avlyakulov.timur.epam.chapter_10.variant_b.rocks.entity.Rock;

import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RockController {
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
        System.out.println("If you want to finish your program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createNecklace(reader);
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
            Rock[] necklace = new Rock[3];
            while (i < counter) {
                Rock rock;
                System.out.println("Выберите тип камня который хотите создать 1 диамант или 2 аметист");
                String type = reader.readLine();
                switch (type) {
                    case "1" -> {
                        System.out.println("Введите цену диаманта ");
                        int cost = Integer.parseInt(reader.readLine());
                        System.out.println("Введите прозрачность диаманта в % от 1 до 100 в этом диапазоне");
                        int transparency = Integer.parseInt(reader.readLine());
                        if (transparency < 0 || transparency > 100) {
                            System.out.println("Вы ввели неправильное значение пожалуйста в следующий раз введите правильное");
                            return;
                        }
                        rock = new Diamond(cost, transparency);
                        addToNecklaceRock(necklace, numberOfRock, rock);
                    }
                    case "2" -> {
                        System.out.println("Введите цену аметиста ");
                        int cost = Integer.parseInt(reader.readLine());
                        System.out.println("Введите прозрачность аметиста в % от 1 до 100 в этом диапазоне");
                        int transparency = Integer.parseInt(reader.readLine());
                        if (transparency < 0 || transparency > 100) {
                            System.out.println("Вы ввели неправильное значение пожалуйста в следующий раз введите правильное");
                            return;
                        }
                        rock = new Amethyst(cost, transparency);
                        addToNecklaceRock(necklace, numberOfRock, rock);
                    }
                }
                System.out.println("Ваше ожерелье имеет такой вид\n " + Arrays.toString(necklace));
                ++i;
            }
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
    }

    public void addToNecklaceRock(Rock[] rocks, int numberOfRocks, Rock rock) {
        if (numberOfRocks == rocks.length) {
            Rock[] rocks1 = new Rock[rocks.length + 1];
            System.arraycopy(rocks, 0, rocks1, 0, rocks.length);
            rocks = rocks1;
        }
        rocks[numberOfRocks] = rock;
        ++numberOfRocks;
    }
}