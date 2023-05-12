package avlyakulov.timur.epam.chapter_3.array.controller;

import avlyakulov.timur.epam.chapter_3.array.entity.Massiv;
import avlyakulov.timur.epam.chapter_3.array.service.MassivService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MassivController {
    private final MassivService massivService = new MassivService();

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select your option ");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                position = reader.readLine();
                if (position.equals("0"))
                    System.exit(0);
                crud(position, reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("if you want create array, please enter 1");
        System.out.println("if you want bubble sort array, please enter 2");
        System.out.println("if you want shaker sort array, please enter 3");
        System.out.println("if you want simpleChoose sort array, please enter 4");
        System.out.println("if you want hash sort array, please enter 5");
        System.out.println("if you want SimpleInsertion sort array, please enter 6");
        System.out.println("if you want BinaryMerge sort array, please enter 7");
        System.out.println("if you want Shell sort array, please enter 8");
        System.out.println("if you want findAll arrays, please enter 9");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createMassiv(reader);
            case "2" -> sortBubble(reader);
            case "3" -> sortShaker(reader);
            case "4" -> sortSimpleChoose(reader);
            case "5" -> sortHash(reader);
            case "6" -> sortSimpleInsertion(reader);
            case "7" -> sortBinaryMerge(reader);
            case "8" -> sortShell(reader);
            case "9" -> findAll();
        }
        runNavigation();
    }

    public void createMassiv(BufferedReader reader) {
        try {
            System.out.println("Enter length of array ");
            int length = Integer.parseInt(reader.readLine());
            int[] array = new int[length];
            System.out.print("Enter elements of array ");
            for (int i = 0; i < length; ++i)
                array[i] = Integer.parseInt(reader.readLine());
            Massiv massiv = new Massiv();
            massiv.setArray(array);
            massivService.createMassiv(massiv);
        } catch (IOException e) {
            System.out.println("problem: " + e.getMessage());
        }
    }

    public void sortBubble(BufferedReader reader) {
        try {
            Massiv[] massivs = massivService.findAll();
            System.out.println("Choose array to sort");
            System.out.println("Our massivs: ");
            for (Massiv massiv : massivs)
                if (massiv != null) {
                    System.out.println(massiv);
                }
            int choose = Integer.parseInt(reader.readLine());
            massivService.sortBubble(massivs[choose - 1].getArray());
            System.out.println("Our massiv after sorting");
            System.out.println(massivs[choose - 1]);
        } catch (IOException e) {
            System.out.println("problem" + e.getMessage());
        }
    }

    public void sortShaker(BufferedReader reader) {
        try {
            Massiv[] massivs = massivService.findAll();
            System.out.println("Choose array to sort");
            System.out.println("Our massivs: ");
            for (Massiv massiv : massivs)
                if (massiv != null) {
                    System.out.println(massiv);
                }
            int choose = Integer.parseInt(reader.readLine());
            massivService.sortShaker(massivs[choose - 1].getArray());
            System.out.println("Our massiv after sorting");
            System.out.println(massivs[choose - 1]);

        } catch (IOException e) {
            System.out.println("problem" + e.getMessage());
        }
    }
    public void sortSimpleChoose (BufferedReader reader) {
        try {
            Massiv[] massivs = massivService.findAll();
            System.out.println("Choose array to sort");
            System.out.println("Our massivs: ");
            for (Massiv massiv : massivs)
                if (massiv != null) {
                    System.out.println(massiv);
                }
            int choose = Integer.parseInt(reader.readLine());
            massivService.sortSimpleChoose(massivs[choose - 1].getArray());
            System.out.println("Our massiv after sorting");
            System.out.println(massivs[choose - 1]);
        }
        catch (IOException e ) {
            System.out.println("problem" + e.getMessage());
        }
    }
    public void sortHash(BufferedReader reader) {
        try {
            Massiv[] massivs = massivService.findAll();
            System.out.println("Choose array to sort");
            System.out.println("Our massivs: ");
            for (Massiv massiv : massivs)
                if (massiv != null) {
                    System.out.println(massiv);
                }
            int choose = Integer.parseInt(reader.readLine());
            massivService.sortHash(massivs[choose - 1].getArray());
            System.out.println("Our massiv after sorting");
            System.out.println(massivs[choose - 1]);
        }
        catch (IOException e ) {
            System.out.println("problem" + e.getMessage());
        }
    }
    public void sortSimpleInsertion(BufferedReader reader) {
        try {
            Massiv[] massivs = massivService.findAll();
            System.out.println("Choose array to sort");
            System.out.println("Our massivs: ");
            for (Massiv massiv : massivs)
                if (massiv != null) {
                    System.out.println(massiv);
                }
            int choose = Integer.parseInt(reader.readLine());
            massivService.sortSimpleInsertion(massivs[choose - 1].getArray());
            System.out.println("Our massiv after sorting");
            System.out.println(massivs[choose - 1]);
        }
        catch (IOException e ) {
            System.out.println("problem" + e.getMessage());
        }
    }
    public void sortBinaryMerge (BufferedReader reader) {
        try {
            Massiv[] massivs = massivService.findAll();
            System.out.println("Choose array to sort");
            System.out.println("Our massivs: ");
            for (Massiv massiv : massivs)
                if (massiv != null) {
                    System.out.println(massiv);
                }
            int choose = Integer.parseInt(reader.readLine());
            massivService.sortBinaryMerge(massivs[choose - 1].getArray());
            System.out.println("Our massiv after sorting");
            System.out.println(massivs[choose - 1]);
        }
        catch (IOException e ) {
            System.out.println("problem" + e.getMessage());
        }
    }
    public void sortShell (BufferedReader reader) {
        try {
            Massiv[] massivs = massivService.findAll();
            System.out.println("Choose array to sort");
            System.out.println("Our massivs: ");
            for (Massiv massiv : massivs)
                if (massiv != null) {
                    System.out.println(massiv);
                }
            int choose = Integer.parseInt(reader.readLine());
            massivService.sortShell(massivs[choose - 1].getArray());
            System.out.println("Our massiv after sorting");
            System.out.println(massivs[choose - 1]);
        }
        catch (IOException e ) {
            System.out.println("problem" + e.getMessage());
        }
    }

    public void findAll() {
        Massiv[] massivs = massivService.findAll();
        System.out.println("Our massivs: ");
        for (Massiv massiv : massivs)
            if (massiv != null)
                System.out.println(massiv);
    }
}