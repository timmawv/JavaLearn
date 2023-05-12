package avlyakulov.timur.epam.chapter_8.example.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class InstantMain {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        //parsing String
        instant = Instant.parse("2020-03-17T14:27:32.728500600Z");
        System.out.println(instant);
        //current time in millisec
        long millis = System.currentTimeMillis();
        System.out.println(millis);
        //millisec to date time conversion
        instant = Instant.ofEpochMilli(millis);
        System.out.println(instant);
        //conversion instant to locale date
        LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(localDate);
    }
}