package avlyakulov.timur.practise;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();
        System.out.println(current_Year);
    }
}