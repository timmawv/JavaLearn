package avlyakulov.timur.epam.chapter_11.example.algoritms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AlgorithmMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.rotate(list, -1);
        System.out.println(list);
        List<Integer> singletonList = Collections.singletonList(777);
        System.out.println("SingletonList");
        //singletonList.add(21); // run time error
        System.out.println(singletonList);
    }
}
