package avlyakulov.timur.epam.chapter_8.example.date.local;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        //Дату, время и дату\время можно изменять, применяя группу методов plusXXX(), minusXXX():
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        localDate = localDate.plusDays(2)
                .minusMonths(1)
                .plusYears(2);
        System.out.println(localDate);
        //При необходимости можно задать текущие дату, время и дату\время:
        LocalDate localDate1 = LocalDate.of(2028, Month.OCTOBER,15);
        LocalTime localTime = LocalTime.of(14,58,48);
        LocalDateTime localDateTime = LocalDateTime.of(localDate1,localTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2026,4,15,14,30,25);
        System.out.println(localDate1);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        //Дату, время и дату\время можно сравнивать на «до» и «после»:
        LocalDate nowDate = LocalDate.now();
        LocalDate afterDate = LocalDate.of(2055,4,24);
        boolean after = nowDate.isAfter(afterDate);
        boolean before = nowDate.isBefore(afterDate);
        System.out.println(after + " " + before);
        System.out.println("-------------------------");
        //Классы пакета также умеют преобразовывать дату, время и дату\время из пред-
        //ставления в виде строки в объект, а также форматировать их с помощью класса
        //DateTimeFormatter для последующего вывода, применяя различные паттерны:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MM yyyy");
        String date = "12 05 2024";
        LocalDate localDate2 = LocalDate.parse(date,formatter);
        System.out.println(localDate2);
        System.out.println("-------------------------");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d-MMMM-yyyy", Locale.US);//в моей локали это не работает, надо менять на США
        date = "3-August-2026";
        LocalDate localDate3 = LocalDate.parse(date,formatter1);
        System.out.println(localDate3);
        System.out.println(formatter1.format(localDate3));
        System.out.println("-------------------------");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("E, MMM d yyyy",Locale.US);
        date = "Mon, Jan 30 2023";
        LocalDate localDate4 = LocalDate.parse(date,formatter2);
        System.out.println(localDate4);
        System.out.println(formatter2.format(localDate4));
        System.out.println("-------------------------");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a", Locale.US);
        date = "Monday, May 25, 2020 10:30:56 AM";
        LocalDateTime localDateTime2 = LocalDateTime.parse(date,formatter3);
        System.out.println(localDateTime2);
        System.out.println(formatter3.format(localDateTime2));
        System.out.println("-------------------------------");
        //Класс java.time.Period позволяет задавать и манипулировать промежутками в днях между датами:
        LocalDate before1 = LocalDate.of(2022,11,20);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        Period period = Period.between(before1,now);
        System.out.println(period);
        System.out.println(period.getDays());
        System.out.println("--------------------------------");
        //Класс java.time.Duration исполняет ту же роль, что и класс Period,
        //но только промежутки измеряются в днях, часах, минутах, секундах:
        LocalTime time06am = LocalTime.of(6,0,0);
        LocalTime time11pm = LocalTime.of(23,45,30);
        Duration duration = Duration.between(time06am,time11pm);
        System.out.println(duration.toHours() + " hours");
        LocalDate newYear = LocalDate.of(2023,1,1);
        LocalDate today = LocalDate.now();
        long daysToToday = ChronoUnit.DAYS.between(newYear,today);
        System.out.println(daysToToday + " days");

    }
}