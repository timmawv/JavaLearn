package avlyakulov.timur.epam.chapter_7.strings;
/*
Написать функциональный интерфейс с методом, который принимает две
строки и возвращает тоже строку. Написать реализацию такого интерфейса
в виде лямбды, которая возвращает ту строку, которая длиннее.
 */
@FunctionalInterface
public interface CheckLengthString {
    String checkLengthString (String s1,String s2);
}