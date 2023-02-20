package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Реализуем обычную игру в города
public class GameCities {
    public static void main(String[] args) {
        boolean checkAnswer = true;
        List<String> cities = new ArrayList<>();
        System.out.println("Введите название город для начала игры");
        String city = new Scanner(System.in).nextLine().toLowerCase();
        cities.add(city);
        while (checkAnswer) {
            System.out.println("Введите название города которое начинается с последней буквы вашего последнего слова");
            String cityAnswer =  new Scanner(System.in).nextLine().toLowerCase();
            if (cityAnswer.charAt(0) == city.charAt(city.length() - 1) && !cities.contains(cityAnswer)) {
                cities.add(cityAnswer);
                city = cityAnswer;
            }
            else {
                System.out.println("Ваш ответ не удовлетворяет условия игры и вы проиграли!");
                checkAnswer = false;
            }
        }
    }
}