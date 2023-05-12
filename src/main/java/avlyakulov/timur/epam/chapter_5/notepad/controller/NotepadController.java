package avlyakulov.timur.epam.chapter_5.notepad.controller;

import avlyakulov.timur.epam.chapter_5.notepad.entity.Notepad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotepadController {

    public Notepad notepad;

    public boolean checkNotepadIsCreated() {
        if (notepad == null) {
            System.out.println("You didnt create a notepad ");
            return false;
        } else return true;
    }

    public void run() {
        String answer;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            runNavigation();
            while ((answer = reader.readLine()) != null) {
                if (answer.equals("0"))
                    System.exit(0);
                else {
                    crud(answer, reader);
                }
            }
        } catch (IOException e) {
            System.out.println("You have a problem in " + this.getClass() + e.getMessage());
        }
    }

    public void crud(String answer, BufferedReader reader) {
        switch (answer) {
            case "1" -> {
                if (notepad == null) {
                    System.out.println("Creating a notepad...");
                    notepad = new Notepad();
                    System.out.println("Notepad was created");
                } else System.out.println("You have created a notepad");
            }
            case "2" -> {
                if (checkNotepadIsCreated())
                    addNoteToNotepad(reader);
            }
            case "3" -> {
                if (checkNotepadIsCreated())
                    printNotepad();
            }
            default -> System.out.println("You enter the wrong number");
        }
        runNavigation();
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create a notepad please enter 1");
        System.out.println("If you want to add note to notepad please enter 2");
        System.out.println("If you want to print your notepad please enter 3");
        System.out.println();
    }

    public void addNoteToNotepad(BufferedReader reader) {
        try {
            System.out.println("Enter a note to add it to Notepad");
            String text = reader.readLine();
            Notepad.Note note = notepad.new Note(text);
            notepad.addNoteToNotepad(note);
        } catch (IOException e) {
            System.out.println("You have a problem in this method " + this.getClass() + e.getMessage());
        }
    }

    public void printNotepad() {
        for (Notepad.Note note : notepad.getNotepad())
            System.out.println(note);
    }
}