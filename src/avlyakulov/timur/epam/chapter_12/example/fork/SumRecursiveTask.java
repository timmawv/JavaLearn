package avlyakulov.timur.epam.chapter_12.example.fork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

//fork/join для задач с возвращаемым значением
public class SumRecursiveTask extends RecursiveTask<Long> {
    private List<Long> longList;
    private int begin;
    private int end;
    public static final long THRESHOLD = 10_000;

    public SumRecursiveTask(List<Long> longList) {
        this(longList, 0, longList.size());
    }

    private SumRecursiveTask(List<Long> longList, int begin, int end) {
        this.longList = longList;
        this.begin = begin;
        this.end = end;
    }

    // до Stream API
    /*@Override
    protected Long compute() {
        int length = end - begin;
        long result = 0;
        if (length <= THRESHOLD) {
            for (int i = begin; i < end; ++i)
                result += longList.get(i);
        } else {
            int middle = begin + length / 2;
            SumRecursiveTask taskLeft = new SumRecursiveTask(longList, begin, middle);
            taskLeft.fork(); // run async оно запустилось и ждет пока оно выполнится и получит результат
            SumRecursiveTask taskRight = new SumRecursiveTask(longList, middle, end);
            taskRight.fork();// or compute()
            Long leftSum = taskLeft.join();
            Long rightSum = taskRight.join();
            result = leftSum + rightSum;
        }
        return result;
    }*/

    //тот же пример уже с Stream API
    @Override
    protected Long compute() {
        int length = end - begin;
        long result = 0;
        if (length <= THRESHOLD) {
            for (int i = 0; i < end; ++i)
                result += longList.get(i);
        } else {
            int middle = begin + length / 2;
            List<SumRecursiveTask> tasks = new ArrayList<>();
            tasks.add(new SumRecursiveTask(longList, begin, middle));
            tasks.add(new SumRecursiveTask(longList, middle, end));
            tasks.stream().forEach(RecursiveTask::fork);
            result = tasks.stream()
                    .map(RecursiveTask::join)
                    .reduce((r1, r2) -> r1 + r2)
                    .orElse(0L);
        }
        return result;
    }
}