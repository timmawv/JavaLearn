package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_15;

import java.util.Arrays;
import java.util.Scanner;

/*
Напечатать квитанцию об оплате телеграммы, если стоимость одного слова задана
 */
public class PrintCostTelegram {
    public static void main(String[] args) {
        System.out.println("Введите стоимость одного слова в телеграме");
        Scanner sc = new Scanner(System.in);
        int costWord = sc.nextInt();
        String text = "Здравствуйте   пишу вам телегамму, это очень важно мне нужна ваша помощь, жду вашего ответа";
        long numbWords = Arrays.stream(text.replaceAll(",\\s", " ").split("\\s+"))
                .count();
        System.out.println("Стоимость вашего письма бюудет составлять " + (numbWords * costWord));
        sc.close();
    }
}