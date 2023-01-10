package avlyakulov.timur.epam.chapter_7.user.controller;

import avlyakulov.timur.epam.chapter_7.user.entity.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserController {
    User[] users = new User[10];
    int counter = 0;
    private int id = 0;

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create a user press 1");
        System.out.println("If you want to get all users press 2");
        System.out.println("");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createUser(reader);
            case "2" -> printUser();
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
    public void printUser () {
        for (User u : users)
            if (u!= null)
                System.out.println(u);
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
            User user = new User(id,name,age,country);
            ++id;
            users[counter] = user;
            ++counter;
        }
        catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }
}