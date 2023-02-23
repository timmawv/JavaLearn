package avlyakulov.timur.epam.chapter_9.task;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
В символьном файле находится информация об N числах с плавающей запятой
с указанием локали каждого числа отдельно. Прочитать информацию из файла.
Проверить на корректность, то есть являются ли числа числами. Преобразовать
к числовым значениям и вычислить сумму и среднее значение прочитанных чисел.
Создать собственный класс исключения. Предусмотреть обработку исклю-
чений, возникающих при нехватке памяти, отсутствии самого файла по задан-
ному адресу, отсутствии или некорректности требуемой записи в файле, недо-
пустимом значении числа (выходящим за пределы максимально допустимых
значений) и т.д.
 */
public class ParseFileValuesToNumbers {
    public static void main(String[] args) {
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_9\\task\\numbers.txt");
        //String language = "";
        float num;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext("\\d+,\\d+")) {
                num = sc.nextFloat();
                System.out.println(num);
                NumberFormat formatter = NumberFormat.getInstance(Locale.GERMAN);
                String numGer = formatter.format(num);
                System.out.println(numGer);
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't find file", e);
        }
    }
}