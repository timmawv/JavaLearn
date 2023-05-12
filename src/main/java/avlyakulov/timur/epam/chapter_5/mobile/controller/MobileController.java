package avlyakulov.timur.epam.chapter_5.mobile.controller;

import avlyakulov.timur.epam.chapter_5.mobile.entity.Company;
import avlyakulov.timur.epam.chapter_5.mobile.entity.Mobile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MobileController {
    Mobile mobile;

    public boolean checkMobileIsCreate() {
        if (mobile == null) {
            System.out.println("You don't create a mobile");
            return false;
        } else return true;
    }

    public void run() {
        String answer;
        runNavigation();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while( (answer = reader.readLine()) != null) {
                if (answer.equals("0"))
                    System.exit(0);
                else {
                    crud(answer,reader);
                }
            }
        } catch (IOException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }

    public void crud(String answer, BufferedReader reader) {
        switch (answer) {
            case "1" -> {
                if (mobile != null) {
                    System.out.println("You have create a mobile");
                } else mobile = new Mobile();
            }
            case "2" -> {
                if (checkMobileIsCreate())
                    addMobile(reader);
            }
            case "3" -> {
                if (checkMobileIsCreate())
                    System.out.println(Arrays.toString(mobile.getModels()));
            }
            default -> System.out.println("You enter the wrong number");
        }
        runNavigation();
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create a mobile press 1");
        System.out.println("If you want to add mobile press 2");
        System.out.println("If you want to print all models press 3");
        System.out.println();
    }

    public void addMobile(BufferedReader reader) {
        try {
            System.out.println("Choose company of your mobile");
            System.out.println(Arrays.toString(Company.values()));
            String companyMobile = reader.readLine();
            Company company = Company.valueOf(companyMobile.toUpperCase());
            System.out.println("Enter the price of your phone");
            int price = Integer.parseInt(reader.readLine());
            System.out.println("Enter the capacity of battery in mAh");
            int capacityOfBattery = Integer.parseInt(reader.readLine());
            Mobile.Model model = mobile. new Model(company,price,capacityOfBattery);
            mobile.addModelToMobile(model);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }
}
