package avlyakulov.timur.epam.chapter_11.variant_a.task_5;

import java.util.Stack;

//Задать два стека, поменять информацию местами.
public class ChangeInformationStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(12);
        stack.add(13);
        stack.add(14);
        stack.add(20);
        Stack<Integer> stack2 = new Stack<>();
        stack2.add(1);
        stack2.add(5);
        stack2.add(3);
        stack2.add(8);
        System.out.println("Изначальные стеки");
        System.out.println("Stack - " + stack);
        System.out.println("Stack2 - " + stack2);
        Stack<Integer> temp = new Stack<>();
        temp.addAll(stack);
        stack.removeAllElements();
        stack.addAll(stack2);
        stack2.removeAllElements();
        stack2.addAll(temp);
        System.out.println("Поменяли информацию в стеке");
        System.out.println("Stack - " + stack);
        System.out.println("Stack2 - " + stack2);
    }
}