package avlyakulov.timur.epam.chapter_7.numbers;
/*
Написать функциональный интерфейс с методом, который принимает число
и возвращает булево значение. Написать реализацию такого интерфейса
в виде лямбда-выражения, которое возвращает true, если переданное число
делится без остатка на 13.
 */
@FunctionalInterface
public interface CheckDivide {
    boolean checkDivideNumber (int num);
}
