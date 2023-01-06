package avlyakulov.timur.epam.chapter_7.example.consumer;

import avlyakulov.timur.epam.chapter_6.example.entity.RightTriangle;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerTest {
    public static void main(String[] args) {
        String str = "as a- the-d -on and";
        String regex = "-";
        Consumer<String> consumer = s -> System.out.println(Arrays.toString(s.split(regex)));
        consumer.accept(str);
        RightTriangle[] triangles = {new RightTriangle(1, 2), new RightTriangle(3, 4)};
        Arrays.stream(triangles)
                .forEach(t -> t.setSideA(t.getSideA() * 10));
        System.out.println(Arrays.toString(triangles));
        String regex2 = "a";
        Consumer<String> consumer2 = consumer
                .andThen(s -> System.out.println(Arrays.toString(s.split(regex2))));
        consumer2.accept(str);
        //BiConsumer <T,U>
        RightTriangle triangle = new RightTriangle(1,2);
        BiConsumer<RightTriangle,Integer> consumer3 = (t,n) -> t.setSideA(t.getSideA()*n);
        consumer3.accept(triangle,50);
        System.out.println(triangle);
        ObjIntConsumer<RightTriangle> consumer4 = (t,n) -> t.setSideA(t.getSideA() * n);
    }
}