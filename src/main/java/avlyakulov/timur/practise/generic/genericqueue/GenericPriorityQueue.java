package avlyakulov.timur.practise.generic.genericqueue;

import java.util.Arrays;
import java.util.Comparator;

//Реализуйте классы Queue<T> и PriorityQueue<T>, представляющие очередь и приоритетную очередь соответственно. Очередь должна иметь методы:
//enqueue(T element) - добавляет элемент в очередь
//dequeue() - удаляет и возвращает первый элемент из очереди
//peek() - возвращает первый элемент без удаления
//isEmpty() - проверяет, пуста ли очередь
//size() - возвращает количество элементов в очереди
//Приоритетная очередь должна добавлять элементы в порядке, определяемом переданным в конструктор компаратором.
public class GenericPriorityQueue<T> {
    private T[] queue;
    private final Comparator<T> comparator;
    private int length = 0;

    public GenericPriorityQueue(Comparator<T> comparator) {
        this.comparator = comparator;
        queue = (T[]) new Object[1];
    }

    public void enqueue(T element) {
        if (length == queue.length) {
            T[] increasedArray = (T[]) new Object[queue.length + 1];
            System.arraycopy(queue, 0, increasedArray, 0, queue.length);
            queue = increasedArray;
        }
        queue[length] = element;
        ++length;
        if (length > 1)
            Arrays.sort(queue, comparator);
    }

    public T dequeue() {
        T firstElement = queue[0];
        queue[0] = null;
        for (int i = 0; i < length - 1; ++i) {
            T temp = queue[i];
            queue[i] = queue[i + 1];
            queue[i + 1] = temp;
        }
        T[] decreasedArray = (T[]) new Object[queue.length + 1];
        System.arraycopy(queue, 0, decreasedArray, 0, queue.length - 1);
        queue = decreasedArray;
        --length;
        return firstElement;
    }

    public void printQueue() {
        System.out.print("[");
        for (int i = 0; i < length; ++i) {
            System.out.print(queue[i] + ", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        GenericPriorityQueue<Person> persons = new GenericPriorityQueue<>((p1, p2) -> p1.getName().compareTo(p2.getName()));
        persons.enqueue(new Person(12, "Mike"));
        persons.enqueue(new Person(22, "Brus"));
        persons.enqueue(new Person(10, "Lesha"));
        persons.printQueue();
        System.out.println(persons.length);
        System.out.println(persons.dequeue());
        persons.printQueue();
    }
}