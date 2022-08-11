package avlyakulov.timur.book.chapter_3.user.controller;

import avlyakulov.timur.book.chapter_3.user.entity.User;
import avlyakulov.timur.book.chapter_3.user.service.UserService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserController {
    private final UserService userService = new UserService();

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select your option ");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null){
                crud(position,reader);
                position = reader.readLine();
                if (position.equals("0"))
                    System.exit(0);
                crud(position,reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("if you want create user, please enter 1");
        System.out.println("if you want update user, please enter 2");
        System.out.println("if you want delete user, please enter 3");
        System.out.println("if you want findById user, please enter 4");
        System.out.println("if you want findAll user, please enter 5");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> create(reader);
            case "2" -> update(reader);
            case "3" -> delete(reader);
            case "4" -> findById(reader);
            case "5" -> findAll(reader);
        }
        runNavigation();
    }

    private void create(BufferedReader reader) {
        System.out.println("UserController.create");
        try {
            System.out.println("Please enter your name ");
            String name = reader.readLine();
            System.out.println("Please enter your age ");
            String ageString = reader.readLine();
            int age = Integer.parseInt(ageString);
            User user = new User();
            user.setName(name);
            user.setAge(age);
            userService.create(user);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void update(BufferedReader reader) {
        System.out.println("UserController.update");
        try {
            System.out.println("Enter your name to update ");
            String name = reader.readLine();
            System.out.println("Enter your age to update ");
            String ageString = reader.readLine();
            int age = Integer.parseInt(ageString);
            User user = new User();
            user.setAge(age);
            user.setName(name);
            userService.update(user);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    public void delete(BufferedReader reader) {
        System.out.println("UserController.delete");
        try {
            System.out.println("Enter id to delete ");
            String id = reader.readLine();
            userService.delete(id);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    public void findById(BufferedReader reader) {
        System.out.println("UserController.findById");
        try {
            System.out.println("Enter id to find user with same id ");
            String id = reader.readLine();
            User user = userService.findById(id);
            System.out.println("We are here");
            System.out.println("user = " + user);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    public void findAll(BufferedReader reader) {
        System.out.println("UserController.findAll");
        User[] users = userService.findAll();
        if (users != null && users.length != 0) {
            for (User user : users)
                if (user != null)
                    System.out.println("user = " + user);
        } else {
            System.out.println("Users empty");
        }
    }
}