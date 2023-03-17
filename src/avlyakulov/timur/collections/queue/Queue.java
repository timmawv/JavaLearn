package avlyakulov.timur.collections.queue;

public interface Queue<T> {
    void add (T item); // добавить элемент в конец очереди
    T remove(); // извлекти элемент из очереди

    boolean isEmpty();
}