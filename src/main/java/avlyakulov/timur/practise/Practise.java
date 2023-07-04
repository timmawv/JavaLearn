package avlyakulov.timur.practise;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practise {

    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        System.out.println(set);
        for (List<String> p : paths) set.add(p.get(1));
        System.out.println(set);
        for (List<String> p : paths) set.remove(p.get(0));
        System.out.println(set);
        return set.iterator().next();
    }

    public static void main(String[] args) {
        List<List<String>> list = List.of(List.of("B", "C"), List.of("D", "B"),List.of("C", "A"));
        System.out.println(new Practise().destCity(list));
    }
}