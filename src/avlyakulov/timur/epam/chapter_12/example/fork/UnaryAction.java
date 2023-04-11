package avlyakulov.timur.epam.chapter_12.example.fork;

import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.function.UnaryOperator;

public class UnaryAction<T> extends RecursiveAction {
    private List<T> subjectList;
    private UnaryOperator<T> operator;
    private int begin;
    private int end;
    private static final int THRESHOLD = 100_000;

    public UnaryAction(List<T> subjectList, UnaryOperator<T> operator, int begin, int end) {
        this.operator = operator;
        this.subjectList = subjectList;
        this.begin = begin;
        this.end = end;
    }

    public UnaryAction(List<T> subjectList, UnaryOperator<T> operator) {
        this(subjectList, operator, 0, subjectList.size());
    }

    @Override
    protected void compute() {
        if (end - begin < THRESHOLD) {
            System.out.printf("from %d, to %d - thread %s%n", begin, end, Thread.currentThread().getName());
            for (int i = begin; i < end; ++i) {
                subjectList.set(i, operator.apply(subjectList.get(i)));
            }
        } else {
            int oneThird = (begin + end) / 3;
            int middle = (begin + end) / 2;
            invokeAll(new UnaryAction<T>(subjectList, operator, begin, middle),
                    new UnaryAction<T>(subjectList, operator, middle, end));
        }
    }
}