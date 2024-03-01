package avlyakulov.timur.practise_tasks;

import java.util.ArrayList;
import java.util.List;

public class GenericPractise extends Generic {
    public static void main(String[] args) {
        List<Generic> list = new ArrayList<>();
        list.add(new Generic(1));
        list.add(new Generic(2));
        list.add(new Generic(3));
        test(list);
    }
    public static void test (List<? extends Generic> list) {
        System.out.println("We are printing all our elements");
        for (Generic generic : list) {
            System.out.println(generic);
        }
    }
}