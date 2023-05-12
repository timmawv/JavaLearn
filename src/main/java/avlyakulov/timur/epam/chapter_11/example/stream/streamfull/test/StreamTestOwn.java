package avlyakulov.timur.epam.chapter_11.example.stream.streamfull.test;

import avlyakulov.timur.epam.chapter_11.example.stream.streamfull.entity.Employee;
import avlyakulov.timur.epam.chapter_11.example.stream.streamfull.entity.Department;
import avlyakulov.timur.epam.chapter_11.example.stream.streamfull.entity.Event;
import avlyakulov.timur.epam.chapter_11.example.stream.streamfull.entity.Position;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.*;

public class StreamTestOwn {
    private static List<Employee> emps = List.of(
            new Employee("Michael", "Smith", 243, 43, Position.CHEF),
            new Employee("Jane", "Smith", 523, 40, Position.MANAGER),
            new Employee("Jury", "Gagarin", 6423, 26, Position.MANAGER),
            new Employee("Jack", "London", 5543, 53, Position.WORKER),
            new Employee("Eric", "Jackson", 2534, 22, Position.WORKER),
            new Employee("Andrew", "Bosh", 3456, 44, Position.WORKER),
            new Employee("Joe", "Smith", 723, 30, Position.MANAGER),
            new Employee("Jack", "Gagarin", 7423, 35, Position.MANAGER),
            new Employee("Jane", "London", 7543, 42, Position.WORKER),
            new Employee("Mike", "Jackson", 7534, 31, Position.WORKER),
            new Employee("Jack", "Bosh", 7456, 54, Position.WORKER),
            new Employee("Mark", "Smith", 123, 41, Position.MANAGER),
            new Employee("Jane", "Gagarin", 1423, 28, Position.MANAGER),
            new Employee("Sam", "London", 1543, 52, Position.WORKER),
            new Employee("Jack", "Jackson", 1534, 27, Position.WORKER),
            new Employee("Eric", "Bosh", 1456, 32, Position.WORKER)
    );

    private List<Department> deps = List.of(
            new Department(1, 0, "Head"),
            new Department(2, 1, "West"),
            new Department(3, 1, "East"),
            new Department(4, 2, "Germany"),
            new Department(5, 2, "France"),
            new Department(6, 3, "China"),
            new Department(7, 3, "Japan")
    );

    public static void main(String[] args) throws IOException {
        new StreamTestOwn().real();
    }

    public void createStream() throws IOException {
        System.out.println("Пример создания стримов, без их запуска, они просто есть");
        Stream<String> lines = Files.lines(Paths.get("data/res.txt"));
        Stream<Path> list = Files.list(Paths.get("./"));
        Stream<Path> walk = Files.walk(Paths.get("./"), 3);

        IntStream intStream = IntStream.of(1, 3, 5, 6);
        DoubleStream doubleStream = DoubleStream.of(1.2, 3.6);
        IntStream range = IntStream.range(10, 100); // 10 11 ... 99 не включает последнее число в диапазон
        IntStream rangeClosed = IntStream.rangeClosed(10, 100); // 10 ... 100 включает последнее число в диапазон
        int[] ints = {1, 3, 4, 5};
        IntStream stream = Arrays.stream(ints);
        Stream<String> stringStream = Stream.of("1", "2", "4");

        Stream<String> streamBuilder = Stream.<String>builder()
                .add("Mike")
                .add("Vanya")
                .add("Jenya")
                .build();

        Stream<Employee> stream1 = emps.stream();

        Stream<Event> generate = Stream.generate(() -> new Event(UUID.randomUUID(), LocalDateTime.now(), "Some text"));
        //generate.forEach(System.out::println); бесконечны цикл генерации наших ивентов
        Stream<Integer> iterate = Stream.iterate(1950, val -> val + 3);

        Stream<String> concat = Stream.concat(stringStream, streamBuilder); // конкатенация стримов наших в 1 стрим

        System.out.println("Теперь мы будем их запускать то есть выполнять и завершать");
    }

    public void terminate() {
        System.out.println("Пример завершения наших стримов и получения какого-то результата");
        System.out.println(emps.stream().count()); //
        // После того как мы вызвали терминальную операцию, то наш стрим закрывается и мы  уже не можем ничего сделать, можно создать новый стрим
        emps.stream().forEach(System.out::println);
        emps.forEach(System.out::println);
        //только что был пример 2-х методов которые вызываются одинаково та как на коллекции у нас тоже есть такой метод forEach()
        emps.stream().forEachOrdered(System.out::println); // для многопоточки гарантирует правильный обход стрима
        // любые наши коллекции мы можем преобразовать в любую другую коллекцию для этого просто вызывается класс Collectors
        emps.stream().collect(Collectors.toSet());
        //пример преобразования в Map
        Map<Integer, String> map = emps.stream().collect(Collectors.toMap(
                emp -> emp.getId(),
                employee -> String.format("%s %s", employee.getFirstName(), employee.getLastName())
        ));
        System.out.println(map);
        System.out.println("пример сложение всех элементов в 1 с помощью");
        IntStream intStream1 = IntStream.of(100, 200, 300, 500, 675);
        System.out.println(intStream1.reduce((left, right) -> left + right).orElse(0));
        System.out.println("Пример reduce Objects");

        emps.stream().noneMatch(employee -> employee.getAge() > 60); // true
        emps.stream().anyMatch(employee -> employee.getPosition() == Position.CHEF); // true
        emps.stream().allMatch(employee -> employee.getAge() > 18); // true
    }

    public void transform() {
        System.out.println("Обработка наших стримов при этом не завершая их");
        LongStream longStream = IntStream.of(100, 200, 300, 400).mapToLong(Long::valueOf);
        longStream.forEach(System.out::println);
        Stream<Event> eventStream = IntStream.of(100, 200, 300, 400).mapToObj(value ->
                new Event(UUID.randomUUID(), LocalDateTime.of(value, 12, 1, 12, 0), "Some text"));
        eventStream.forEach(System.out::println);
        System.out.println("Пример с takeWhile() пока не выполнится наше условие ");
        emps.stream().takeWhile(employee -> employee.getAge() > 30).forEach(System.out::println); // отрабатывает до тех пора пока значения валидные
        System.out.println();
        System.out.println("Пример с dropWhile() после 1-го невалдиного значения ");
        emps.stream().dropWhile(employee -> employee.getAge() > 30).forEach(System.out::println); // начинает работать когда пока закончаться валидные значения
        //потом будет выводить все подряд
        // пример с flatMap который увеличивает количество наших элементов
        System.out.println();
        IntStream.of(100, 200, 300, 400)
                .flatMap(value -> IntStream.of(value - 50, value))
                .forEach(System.out::println);
    }

    public void real() {
        IntSummaryStatistics summaryStatistics = emps.stream()
                .mapToInt(Employee::getAge)
                .summaryStatistics();
        System.out.println(summaryStatistics);
    }
}