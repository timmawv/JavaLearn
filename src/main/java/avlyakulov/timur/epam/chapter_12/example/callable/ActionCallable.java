package avlyakulov.timur.epam.chapter_12.example.callable;

import java.util.List;
import java.util.concurrent.Callable;

public class ActionCallable implements Callable<Integer> {
    private List<Integer> list;

    public ActionCallable(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i : list)
            sum += i;
        return sum;
    }
}