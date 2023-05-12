package avlyakulov.timur.epam.chapter_12.example.fork_join;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumRecursiveTaskWithStream extends RecursiveTask<Long> {
    private List<Long> list;
    private int begin;
    private int end;
    public static final long THRESHOLD = 10_000;

    public SumRecursiveTaskWithStream(List<Long> list) {
        this(list, 0, list.size());
    }

    private SumRecursiveTaskWithStream(List<Long> list, int begin, int end) {
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
            int middle = length / 2;
            List<SumRecursiveTaskWithStream> tasks = new ArrayList<>();
            tasks.add(new SumRecursiveTaskWithStream(list, begin, middle));
            tasks.add(new SumRecursiveTaskWithStream(list, middle, end));
            tasks.stream().forEach(RecursiveTask::fork);
            result = tasks.stream()
                    .map(RecursiveTask::join)
                    .reduce((r1, r2) -> r1 + r2)
                    .orElse(0L);
        }
        return result;
    }
}