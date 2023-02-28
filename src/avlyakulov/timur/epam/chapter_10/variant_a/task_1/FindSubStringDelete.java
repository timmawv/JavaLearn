package avlyakulov.timur.epam.chapter_10.variant_a.task_1;


import java.io.*;
import java.util.Scanner;

/*
В каждой строке найти и удалить заданную подстроку.
 */
public class FindSubStringDelete {
    public static void main(String[] args) {
        File fileRead = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_a\\task_1\\info.txt");
        File fileWrite = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_a\\task_1\\New_info.txt");
        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileRead));
             PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileWrite)))) {
            while (reader.ready()) {
                text = text.concat(reader.readLine() + '\n');
            }
            System.out.println(text);
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку которую хотите удалить");
            String wordToDelete = sc.nextLine();
            text = text.replace(wordToDelete, "");
            System.out.println("Наша строчка после удаления заданой подстроки \n" + text);
            printWriter.write(text);
        } catch (IOException e) {
            System.out.println("Can't find file " + e.getMessage());
        }
    }
}