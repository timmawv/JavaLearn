package avlyakulov.timur.epam.chapter_10.variant_a.task_2;

import java.io.*;
import java.util.Scanner;

/*
В каждой строке стихотворения найти и заменить заданную подстроку на подстроку иной длины.
 */
public class FindPasteString {
    public static void main(String[] args) {
        File fileRead = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_a\\task_2\\info.txt");
        File fileWrite = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_a\\task_2\\New_info.txt");
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileRead));
             Scanner sc = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileWrite)))) {
            String text = "";
            while (fileReader.ready()) {
                text = text.concat(fileReader.readLine() + '\n');
            }
            System.out.println(text);
            System.out.println("Введите строку которую надо заменить");
            String substring = sc.nextLine();
            System.out.println("Введите нову строку которую надо вставить на место старой");
            String strReplace = sc.nextLine();
            text = text.replace(substring,strReplace);
            System.out.println(text);
            printWriter.write(text);
        } catch (IOException e) {
            throw new RuntimeException("Can't find file",e);
        }
    }
}