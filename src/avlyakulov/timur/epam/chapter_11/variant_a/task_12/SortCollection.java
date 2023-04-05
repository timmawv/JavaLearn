package avlyakulov.timur.epam.chapter_11.variant_a.task_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.
public class SortCollection {
    public void sortOurCollection() {
        File file = new File("data/fileText.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            ArrayList<String> list = new ArrayList<>();
            while (reader.ready()) {
                list.add(reader.readLine());
            }
            System.out.println("Наш список до сортировки " + list);
            Collections.sort(list); // соритровка происходит по алфавиту
            System.out.println("Наш список после сортировки " + list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}