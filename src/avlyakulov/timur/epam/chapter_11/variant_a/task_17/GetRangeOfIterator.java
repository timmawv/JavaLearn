package avlyakulov.timur.epam.chapter_11.variant_a.task_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Написать функцию, которая получала бы итераторы на начало и конец от-
//сортированного List и заданный символ. Возвращать функция должна на-
//чало и конец диапазона, строки в котором начинаются с заданного символа
public class GetRangeOfIterator {
    public String getStartAndEndOfRange() {
        List<String> list = new ArrayList<>();
        String result = "";
        list.add("x");
        list.add("a");
        list.add("y");
        list.add("h");
        list.add("s");
        list.add("p");
        Collections.sort(list);
        String start;
        String end;
        System.out.println("Our list of symbols");
        System.out.println(list);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter start symbol");
            start = reader.readLine();
            System.out.println("Enter end symbol");
            end = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.equals(start)) {
                while (!word.equals(end)) {
                    result = result.concat(word + ",");
                    word = iterator.next();
                }
            }
        }
        return result;
    }
}
