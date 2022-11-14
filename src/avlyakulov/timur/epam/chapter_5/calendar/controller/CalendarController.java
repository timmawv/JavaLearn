package avlyakulov.timur.epam.chapter_5.calendar.controller;

import avlyakulov.timur.epam.chapter_5.calendar.entity.CalendarWeekends;
import avlyakulov.timur.epam.chapter_5.calendar.entity.TypeOfDay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CalendarController {
    CalendarWeekends calendarWeekends;

    public boolean isCalendarCreated () {
        if (calendarWeekends == null) {
            System.out.println("You didn't create a calendar");
            return false;
        }
        else return true;
    }

    public void run () {
        String position;
        runNavigation();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else crud(position,reader);
                runNavigation();
            }
        }
        catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value" + e.getMessage());
        }
    }

    public void crud (String position,BufferedReader reader) {
        switch (position) {
            case "1" -> {
                if (calendarWeekends != null)
                    System.out.println("You have created a calendar");
                else calendarWeekends = new CalendarWeekends();
            }
            case "2" -> {
                if (isCalendarCreated())
                    addDateToCalendar(reader);
            }
            case "3" -> {
                if (isCalendarCreated())
                    System.out.println(Arrays.toString(calendarWeekends.getCalendar()));
            }
        }

    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create calendar press 1");
        System.out.println("If you want to add date to calendar press 2");
        System.out.println("If you want to get all dates from calendar press 3");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }

    public void addDateToCalendar (BufferedReader reader) {
        try {
            System.out.println("Enter the date in format dd.mm.yyyy");
            String date = reader.readLine();
            System.out.println("Enter the short note to this day");
            String noteAboutDay = reader.readLine();
            System.out.println("Enter the type of day Holiday/Weekend ");
            TypeOfDay typeOfDay = TypeOfDay.valueOf(reader.readLine().toUpperCase());
            CalendarWeekends.Date dateOfDay = calendarWeekends. new Date(date,noteAboutDay,typeOfDay);
            calendarWeekends.addDateToCalendar(dateOfDay);
        }
        catch (IOException | IllegalArgumentException e){
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }
}
