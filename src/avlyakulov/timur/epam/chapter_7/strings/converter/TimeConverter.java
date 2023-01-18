package avlyakulov.timur.epam.chapter_7.strings.converter;

/*
Дано время в 12-часовом формате в виде строки.
Конвертировать время в 24-часовой формат.
 */
public class TimeConverter {
    public static void main(String[] args) {
        String timeUkraine;
        String timeEngland = "8:13 p.m.";
        String regexTimeFormat = " ";
        String regexTime = ":";
        String[] timeFormat = timeEngland.split(regexTimeFormat);
        String[] timeArr = timeFormat[0].split(regexTime);
        if (timeFormat[1].equals("a.m."))
            timeUkraine = timeArr[0];
        else timeUkraine = String.valueOf(Integer.parseInt(timeArr[0]) + 12);
        timeUkraine = timeUkraine + ":" + timeArr[1];
        System.out.println(timeUkraine);
    }
}