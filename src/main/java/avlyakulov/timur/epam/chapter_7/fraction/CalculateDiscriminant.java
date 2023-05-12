package avlyakulov.timur.epam.chapter_7.fraction;
/*
Написать функциональный интерфейс с методом, который принимает три
дробных числа: a, b, c и возвращает тоже дробное число. Написать реализа-
цию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант.
 */
@FunctionalInterface
public interface CalculateDiscriminant {
    double calculateDiscriminant (double a,double b,double c);
}
