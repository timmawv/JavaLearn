package avlyakulov.timur.epam.chapter_8.example.date;

import java.time.Clock;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
    }
}