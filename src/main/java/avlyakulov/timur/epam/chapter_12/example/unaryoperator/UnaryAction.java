package avlyakulov.timur.epam.chapter_12.example.unaryoperator;

import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.function.UnaryOperator;

public class UnaryAction<T> extends RecursiveAction {
    private List<T> list;
    private UnaryOperator<T> operator;
    private int begin;
    private int end;
    private static final int THRESHOLD = 100_000;

    public UnaryAction(List<T> list,
                       UnaryOperator<T> operator, int begin, int end) {
        this.operator = operator;
        this.list = list;
        this.begin = begin;
        this.end = end;
    }

    public UnaryAction(List<T> list, UnaryOperator<T> operator) {
        this(list, operator, 0, list.size());
    }

    @Override
    protected void compute() {
        if (end - begin < THRESHOLD) {
            System.out.printf("from %d to %d - thread %s%n",
                    begin, end, Thread.currentThread().getName());
            for (int i = begin; i < end; ++i) {
                list.set(i, operator.apply(list.get(i)));
            }
        } else {
            int middle = (begin + end) / 2;
            invokeAll(new UnaryAction<T>(list, operator, begin, middle),
                    new UnaryAction<T>(list, operator, middle, begin));
        }
    }
}
