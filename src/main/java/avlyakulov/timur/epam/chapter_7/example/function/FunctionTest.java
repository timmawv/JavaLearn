package avlyakulov.timur.epam.chapter_7.example.function;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> fun1 = s -> s.length();//String to Integer
        Function<Integer, String> fun2 = i -> Integer.toBinaryString(i);//Integer to String
        System.out.println(fun1.apply("javaLanguage"));
        System.out.println(fun2.apply(20));
        //example of map
        String[] arrayStr = {"as", "a", "the", "d", "on", "and"};
        System.out.println(Arrays.stream(arrayStr)
                .map(fun1)
                .collect(Collectors.toList()));
        System.out.println(Arrays.stream(arrayStr)
                .map(s -> s.length())
                .collect(Collectors.toList()));
        //композиция из 2-х и более функций
        Function<Integer, Integer> fun3 = fun1.compose(fun2);
        Function<Integer, Integer> fun4 = fun1.compose(i -> Integer.toBinaryString(i));
        System.out.println(fun1.compose(fun2).apply(17));

        //example with array fo integers
        int[] arrayInt = {1, 3, 5, 9, 17, 33, 65};
        System.out.println(Arrays.stream(arrayInt)
                .boxed()
                .map(fun1.compose(i -> Integer.toBinaryString(i)))
                .collect(Collectors.toList()));
        //the same without using fun1
        System.out.println(Arrays.stream(arrayInt)
                .boxed()
                .map(((Function<String, Integer>) s -> s.length())
                        .compose(i -> Integer.toBinaryString(i)))
                .collect(Collectors.toList()));
        //andThen() тоже самое что и compose(), только порядок обратный!
        Function<String, String> fun5 = fun1.andThen(fun2);//Function<String, String> fun4 = fun1.andThen(i -> Integer.toBinaryString(i));
        System.out.println(fun5.apply("java"));
        System.out.println(Arrays.stream(arrayStr)
                .map(fun1.andThen(fun2))
                        .collect(Collectors.toList()));
        //Unary Operator
        UnaryOperator<Integer> operator = i -> ++i;
        System.out.println(operator.apply(2));
        //example BIFunction <T,U,R>
        BiFunction<Double,String,Integer> bi = (d,s) -> (Double.toString(d) + s).length();
        int length = bi.apply(1.23,"java");
        System.out.println(length);
        BiFunction<Double,String,String> bi2 = (d,s) -> (d + s);
        String word = bi2.apply(3.14,"pi");
        System.out.println(word);
        //Binary Operator
        BinaryOperator<String> binaryOperator = (s1,s2) -> s1 + s2.toUpperCase();
        System.out.println(binaryOperator.apply("oracle","epam"));

    }
}