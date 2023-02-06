package avlyakulov.timur.epam.chapter_8.example.variant_a.task_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В зависимости от признака (0 или 1) в каждой строке текста удалить указан-
ный символ везде, где он встречается, или вставить его после k-гo символа.
 */
public class DeleteSymbol {
    public static void main(String[] args) {
        String text = "Наше слово было важное слово, которое есть важным слово в нашем тексте";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите 0 - чтобы удалить указаный символ везде или 1 - вставить указаный символ");
            String sign = reader.readLine();
            if (!sign.equals("0") && !sign.equals("1")) {
                System.out.println("Вы ввели неправильное значение");
                System.exit(0);
            }
            System.out.println("Введите символ который хотите вставить или удалить ");
            String symbol = reader.readLine();
            if (sign.equals("0")) {
                text = text.replaceAll(symbol, "");
            } else {
                System.out.println("Введите к-тый символ после которого хотите вставить указаный символ");
                int position = Integer.parseInt(reader.readLine());
                char[] textChar = text.toCharArray();
                char[] textChar1 = new char[textChar.length + 1];
                System.arraycopy(textChar,0,textChar1,0,position);
                textChar1[position] = symbol.charAt(0);
                System.arraycopy(textChar,position,textChar1,position + 1,textChar.length - position);
                textChar = textChar1;
                System.out.println(textChar);
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}