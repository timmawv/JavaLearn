package avlyakulov.timur.epam.chapter_8.example.strings;

import java.util.Arrays;

public class StringSortingAlphabet {
    public static void main(String[] args) {
        /* Демонстрацией работы методов класса служит преобразование строки
        в массив объектов типа String и их сортировка в алфавитном порядке. Ниже
        рассмотрена сортировка массива строк методом выбора: */

        String names = "     angelA Alena     Agnes anette albina Anastasya     ALLA ArinA ";
        System.out.println(names);
        names = names.strip();
        System.out.println(names);
        String[] namesArr = names.split(" ");
        System.out.println(Arrays.toString(namesArr));

        /* int compareTo(String s) и compareToIgnoreCase(String s) — лексикографи-
           ческое сравнение строк с учетом и без учета их регистра. Метод осуществляет
           вычитание кодов первых различных символов вызывающей и передаваемой
           строки в метод строк и возвращает целое значение. Метод возвращает значе-
           ние 0 в случае, когда equals() возвращает значение true;*/
        /*for (int i = 0; i < namesArr.length - 1; ++i)
            for (int j = i + 1; j < namesArr.length; ++j)
                if (namesArr[j].compareToIgnoreCase(namesArr[i]) < 0) {
                    String temp = namesArr[i];
                    namesArr[i] = namesArr[j];
                    namesArr[j] = temp;
                }
        System.out.println(Arrays.toString(namesArr));
        for (String arg : namesArr)
            if (!arg.isEmpty())
                System.out.print(arg + ",");*/

        //тоже самое действие но уже со стримом
        Arrays.stream(namesArr)
                .filter(s -> !s.isEmpty())
                .sorted(String::compareToIgnoreCase)
                .forEach(s -> System.out.print(s + ","));
        System.out.println();
        Arrays.stream(namesArr)
                .filter(s -> !s.isEmpty())
                .sorted(String::compareTo)
                .forEach(s -> System.out.print(s + ","));

    }
}
