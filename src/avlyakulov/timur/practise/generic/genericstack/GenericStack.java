package avlyakulov.timur.practise.generic.genericstack;

//Напишите класс GenericStack<T>, который будет иметь следующие методы:
//push(T element) - добавляет элемент в стек
//pop() - удаляет и возвращает верхний элемент из стека
//peek() - возвращает верхний элемент без удаления
//isEmpty() - проверяет, пуст ли стек
//size() - возвращает количество элементов в стеке

public class GenericStack<T> {
    private T[] stack;
    private int length = 0;

    public GenericStack() {
        stack = (T[]) new Object[3]; // capacity
    }

    public GenericStack(String state) {
        state = "Util class";
    }

    public void push(T element) {
        if (length == stack.length) {
            T[] increasedArray = (T[]) new Object[stack.length * 2];
            System.arraycopy(stack, 0, increasedArray, 0, stack.length);
            stack = increasedArray;
        }
        if (stack[0] != null)
            for (int i = length; i > 0; --i) {
                T temp = stack[i];
                stack[i] = stack[i - 1];
                stack[i - 1] = temp;
            }
        stack[0] = element;
        ++length;
    }

    public T pop() {
        if (length == stack.length) {
            T[] increasedArray = (T[]) new Object[stack.length * 2];
            System.arraycopy(stack, 0, increasedArray, 0, stack.length);
            stack = increasedArray;
        }
        T element = stack[0];
        stack[0] = null;
        for (int i = 0; i < length; ++i) {
            T temp = stack[i];
            stack[i] = stack[i + 1];
            stack[i + 1] = temp;
        }
        --length;
        return element;
    }

    public T peek() {
        return stack[0];
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() { // length
        return length;
    }

    public void printStack() {
        System.out.print("[");
        for (Object element : stack)
            if (element != null)
                System.out.print(element + ", ");
        System.out.println("]");
    }

    public static void main(String[] args) {
        GenericStack<Cat> cats = new GenericStack<>();
        System.out.println(cats.isEmpty());
        Cat cat = new Cat(12, "Black");
        cats.push(cat);
        cats.push(new Cat(13, "Pink"));
        cats.push(new Cat(5, "White"));
        cats.push(new Cat(7, "Red"));
        System.out.println(cats.isEmpty());
        System.out.println(cats.peek());
    }
}