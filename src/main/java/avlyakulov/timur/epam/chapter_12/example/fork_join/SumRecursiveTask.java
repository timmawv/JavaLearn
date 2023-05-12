package avlyakulov.timur.epam.chapter_12.example.fork_join;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumRecursiveTask extends RecursiveTask<Long> {
    private List<Long> list;
    private int begin;
    private int end;
    public static final long THRESHOLD = 10_000;

    public SumRecursiveTask(List<Long> list) {
        this(list, 0, list.size());
    }

    private SumRecursiveTask(List<Long> list, int begin, int end) {
        this.list = list;
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - begin;
        long result = 0;
        if (length <= THRESHOLD) {
            for (int i = begin; i < end; ++i) {
                result += list.get(i);
            }
        } else {
            int middle = begin + length / 2;
            SumRecursiveTask taskLeft = new SumRecursiveTask
                    (list, begin, middle);
            taskLeft.fork(); // run async
            SumRecursiveTask taskRight = new SumRecursiveTask
                    (list, middle, end);
            taskRight.fork(); //or compute()
            Long leftSum = taskLeft.join();
            Long rightSum = taskRight.join();
            result = leftSum + rightSum;
        }
        return result;
    }
}