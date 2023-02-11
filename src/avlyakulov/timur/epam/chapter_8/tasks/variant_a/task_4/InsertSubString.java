package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В тексте после k-го символа вставить заданную подстроку.
 */
public class InsertSubString {
    public static void main(String[] args) {
        String text = "Текст который был написан, в нашем слове ошибочно напечатана слово рама, ра двор тоже важное слово";
        int symbol = 0;
        String subString = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите номер символа чтоб поменять в строке ");
            symbol = Integer.parseInt(reader.readLine());
            System.out.println("Введите строку чтоб вставить ее в текст");
            subString = reader.readLine();
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        char[] subStringArr = subString.toCharArray();
        char[] textArr = text.toCharArray();
        char[] textArr1 = new char[textArr.length + subString.length()];
        System.arraycopy(textArr,0,textArr1,0,symbol);
        System.arraycopy(subStringArr,0,textArr1,symbol,subStringArr.length);
        System.arraycopy(textArr,symbol,textArr1,symbol + subStringArr.length, textArr.length - symbol);
        textArr = textArr1;
        System.out.println(textArr);
    }
}