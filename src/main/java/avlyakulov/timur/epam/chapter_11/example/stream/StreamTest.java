package avlyakulov.timur.epam.chapter_11.example.stream;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> strings = List.of("as a the d ann ans anw on and and the".split("\\s+"));
        //limit(long maxSize) — ограничивает выходящий поток заданным в параметре значением;
        strings.stream()
                .limit(1)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        //skip(long n) — не включает в выходной поток первые n элементов исходного потока;
        strings.stream()
                .skip(3)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        //distinct() — удаляет из потока все идентичные элементы;
        strings.stream()
                .distinct()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        //существую 2 вида операция терминальные или промежуточные, если нет терминальной операции, то никакое действие в потоке выполнено не будет!
        //терминальные операции
        System.out.println("Пример работы метода findFirst()");
        String firstStr = strings.stream()
                .filter(s -> s.matches("\\w{3,}"))
                .findFirst()
                .orElse("none");
        System.out.println(firstStr);

        System.out.println("Пример работы findAny()");
        String anyStr = strings.stream()
                .filter(s -> s.matches("an[a-z]"))
                .findAny()
                .orElse("none");
        System.out.println(anyStr);

        //boolean allMatch(Predicate<T> predicate) — возвращает истину, если все элементы stream удовлетворяют условию предиката;
        System.out.println("Пример работы allMatch()");
        boolean res = strings.stream()
                .allMatch(s -> s.length() < 4);
        System.out.println(res);

        //boolean anyMatch(Predicate<T> predicate) — возвращает истину, если хотя бы один элемент stream удовлетворяет условию предиката;
        System.out.println("Пример работы anyMatch()");
        boolean res1 = strings.stream().anyMatch(s -> s.contains("a"));
        System.out.println(res1);

        //boolean noneMatch(Predicate<T> predicate) — возвращает истину, если ни один элемент stream не удовлетворяет условию предиката;
        System.out.println("Пример работы noneMatch()");
        boolean res3 = strings.stream()
                .noneMatch(s -> s.endsWith("f"));
        System.out.println(res3);
    }
}