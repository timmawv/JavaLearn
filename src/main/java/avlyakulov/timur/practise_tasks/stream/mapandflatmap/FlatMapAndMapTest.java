package avlyakulov.timur.practise_tasks.stream.mapandflatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapAndMapTest {
    public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("It is our first line");
            list.add("It is our second line it is very good");
            list.add("It is our third line that is something new");
            List<String> listWords = list.stream()
                    .flatMap(s -> Arrays.stream(s.split("\\s")))
                    .toList();
            System.out.println(listWords);
            List<String> sublist = new ArrayList<>();
            list.stream().map(s -> s.split("")).forEach(strings -> {
                sublist.addAll(Arrays.asList(strings));
            });
            System.out.println(sublist);
    }
}
