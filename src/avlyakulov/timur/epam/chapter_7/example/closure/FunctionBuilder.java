package avlyakulov.timur.epam.chapter_7.example.closure;

import java.util.function.Function;

public class FunctionBuilder {
    //пример создания объекта функции
    public static Function<String, Integer> build (String strNum) {
        int count = 1;
        return t -> {
            int res = Integer.parseInt(strNum + t) + count;
            return res;
        };
    }

    public static void main(String[] args) {
        Function<String, Integer> function = FunctionBuilder.build("100");
        int res = function.apply("77");
        System.out.println(res);
    }
}