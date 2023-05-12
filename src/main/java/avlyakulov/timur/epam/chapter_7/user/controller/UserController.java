package avlyakulov.timur.epam.chapter_7.user.controller;

import avlyakulov.timur.epam.chapter_7.user.entity.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserController {
    User[] users = new User[1];
    int counter = 0;
    private int id = 1;

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create a user press 1");
        System.out.println("If you want to get all users press 2");
        System.out.println("If you want to sort your users by age and country press 3");
        System.out.println("If you want to get all users older than given age press 4");
        System.out.println("If you want to get users with specific letter in name press 5");
        System.out.println("If you want get min and max users by them age press 6");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createUser(reader);
            case "2" -> System.out.println(Arrays.toString(users));
            case "3" -> sortUsers();
            case "4" -> getUsersByAge(reader);
            case "5" -> getUsersByLetter(reader);
            case "6" -> getUsersMinMax();
        }
    }

    public void run() {
        String position;
        runNavigation();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                runNavigation();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }


    public void createUser(BufferedReader reader) {
        try {
            if (users.length == counter) {
                User[] users1 = new User[users.length + 1];
                System.arraycopy(users, 0, users1, 0, users.length);
                users = users1;
            }
            System.out.println("Enter the name of user");
            String name = reader.readLine();
            System.out.println("Enter the age of user");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("Enter the country of user");
            String country = reader.readLine();
            User user = new User(id, name, age, country);
            ++id;
            users[counter] = user;
            ++counter;
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void sortUsers() {
        User.AgeComparator ageComparator = new User.AgeComparator();
        User.CountryComparator countryComparator = new User.CountryComparator();
        System.out.println("Сортировка по возрасту");
        Arrays.stream(users).sorted(ageComparator).forEach(u -> System.out.print(u + " "));
        System.out.println("Сортировка по стране");
        Arrays.stream(users).sorted(countryComparator).forEach(u -> System.out.print(u + " "));
        System.out.println("Сортировка по стране и возрасту");
        Arrays.stream(users).sorted(ageComparator.thenComparing(countryComparator)).forEach(System.out::print);
    }

    public void getUsersByAge(BufferedReader reader) {
        try {
            System.out.println("Enter age for users that need to be older ");
            int age = Integer.parseInt(reader.readLine());
            Predicate<User> userAgePredicate = u -> u.getAge() > age;
            System.out.println(Arrays.stream(users).filter(userAgePredicate).collect(Collectors.toList()));
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void getUsersByLetter(BufferedReader reader) {
        try {
            System.out.println("Enter the letter that user need to have in his name ");
            String letter = reader.readLine();
            while (letter.length() != 1) {
                System.out.println("You have enter the wrong letter try again");
                letter = reader.readLine();
            }
            String finalLetter = letter;
            Predicate<User> userNamePredicate = u -> u.getName().contains(finalLetter);
            System.out.println(Arrays.stream(users).filter(userNamePredicate).collect(Collectors.toList()));
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void getUsersMinMax () {
        User.AgeComparator ageComparator = new User.AgeComparator();
        System.out.println("Сортировка по возрасту");
        Arrays.stream(users).sorted(ageComparator).forEach(u -> System.out.print(u + " "));
        System.out.println("Min user age");
        System.out.println(Arrays.stream(users).min(ageComparator));
        System.out.println("Max user age");
        System.out.println(Arrays.stream(users).max(ageComparator));
    }
}