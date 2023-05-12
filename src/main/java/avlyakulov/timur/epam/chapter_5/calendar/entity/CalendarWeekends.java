package avlyakulov.timur.epam.chapter_5.calendar.entity;

import java.util.Arrays;

/*
Создать класс Календарь с внутренним классом, с помощью объектов
которого можно хранить информацию о выходных и праздничных днях.
 */
public class CalendarWeekends {
    private Date[] calendar;
    private int current;

    public CalendarWeekends() {
        calendar = new Date[3];
    }

    public void addDateToCalendar(Date date) {
        if (current == calendar.length) {
            Date[] calendar1 = new Date[calendar.length + 1];
            System.arraycopy(calendar, 0, calendar1, 0, calendar.length);
            calendar = calendar1;
        }
        calendar[current] = date;
        ++current;
    }

    public Date[] getCalendar() {
        return calendar;
    }

    @Override
    public String toString() {
        return "CalendarWeekends{" +
                "calendar=" + Arrays.toString(calendar) +
                '}';
    }

    public class Date {
        private String date;
        private String noteAboutDay;
        private TypeOfDay typeOfDay;


        public Date(String date, String noteAboutDay, TypeOfDay typeOfDay) {
            this.date = date;
            this.noteAboutDay = noteAboutDay;
            this.typeOfDay = typeOfDay;
        }

        @Override
        public String toString() {
            return "Date{" +
                    "date='" + date + '\'' +
                    ", noteAboutDay='" + noteAboutDay + '\'' +
                    ", typeOfDay=" + typeOfDay +
                    '}' + "\n";
        }
    }
}