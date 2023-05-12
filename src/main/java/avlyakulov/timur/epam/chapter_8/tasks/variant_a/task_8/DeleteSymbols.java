package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Удалить из текста его часть, заключенную между двумя символами, кото-
рые вводятся (например, между скобками «(» и «)» или между звездочками «*» и т.п.).
 */
public class DeleteSymbols {
    public static void main(String[] args) {
        String text = "*Наш текст который* очень важен,/ так же он очень хороший /, мы его читаем, (вот наши важные слова)";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter first symbol ");
            String symbol = reader.readLine();
            System.out.println("Enter second symbol");
            String symbol1 = reader.readLine();
            text = text.replaceFirst(String.format("\\%s[а-яА-Я\\s]*\\%s", symbol, symbol1), symbol + " " + symbol1);
            System.out.println(text);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}