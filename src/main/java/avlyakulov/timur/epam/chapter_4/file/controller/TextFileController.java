package avlyakulov.timur.epam.chapter_4.file.controller;

import avlyakulov.timur.epam.chapter_4.file.entity.TextFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFileController {
    TextFile textFile;

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else {
                    crud(position, reader);
                }
            }
        } catch (IOException e) {
            System.out.println("problem " + e.getMessage());
        }
    }

    public boolean checkTextFile() {
        if (textFile == null) {
            System.out.println("You dont create a text file");
            return false;
        } else return true;
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("if you want to create a text file press 1");
        System.out.println("if you want to delete a text file press 2");
        System.out.println("if you want to rename a text file press 3");
        System.out.println("if you want to print text from text file press 4");
        System.out.println("if you want to add a text to text file press 5");
        System.out.println("if you want to print all information from text file press 6");
        System.out.println("if you want finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createTextFile(reader);
            case "2" -> {
                if (checkTextFile()) deleteFile();
            }
            case "3" -> {
                if (checkTextFile()) renameFile(reader);
            }
            case "4" -> {
                if (checkTextFile()) textFile.printToConsole();
            }
            case "5" -> {
                if (checkTextFile()) addTextToFile(reader);
            }
            case "6" -> {
                if (checkTextFile()) System.out.println(textFile);
            }
        }
        runNavigation();
    }

    public void createTextFile(BufferedReader reader) {
        try {
            System.out.print("Creating a textFile... \n" + "Enter the path of file - ");
            String path = reader.readLine();
            System.out.println("Enter the name of file");
            String name = reader.readLine();
            System.out.println("Enter text to file");
            String text = reader.readLine();
            textFile = new TextFile(path,name,text);
        } catch (IOException e) {
            System.out.println("your problem is " + e.getMessage());
        }
    }
    public void deleteFile () {
        System.out.println("Deleting file...");
        textFile = null;
        System.out.println("File was delete");
    }

    public void renameFile (BufferedReader reader) {
        try {
            System.out.println("Enter the new name of file");
            String name = reader.readLine();
            textFile.rename(name);

        } catch (IOException e) {
            System.out.println("your problem is " + e.getMessage());
        }
    }
    public void addTextToFile (BufferedReader reader) {
        try {
            System.out.println("Enter the text that you want add");
            String text = reader.readLine();
            textFile.addToFile(text);

        } catch (IOException e) {
            System.out.println("your problem is " + e.getMessage());
        }
    }
}