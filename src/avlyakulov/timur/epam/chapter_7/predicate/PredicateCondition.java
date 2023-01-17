package avlyakulov.timur.epam.chapter_7.predicate;


import java.util.function.BiPredicate;
import java.util.function.Function;

/*
Дан предикат condition и две функции ifTrue и ifFalse. Написать метод
ternaryOperator, который из них построит новую функцию, возвращаю-
щую значение функции ifTrue, если предикат выполнен, и значение ifFalse
иначе.
 */
public class PredicateCondition {
    public static boolean ternaryOperator() {
        int num = 3;
        Function<Integer, Boolean> ifTrue = a -> a > 5;
        Function<Integer, Boolean> ifFalse = a -> a < 6;
        BiPredicate<Function<Integer, Boolean>, Function<Integer, Boolean>> condition = (a, b) -> a.apply(num);
        return condition.test(ifTrue,ifFalse);
    }

    public static void main(String[] args) {
        System.out.println(PredicateCondition.ternaryOperator());
    }
}