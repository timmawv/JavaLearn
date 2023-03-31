package avlyakulov.timur.epam.chapter_11.variant_a.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
public class NumberStackReverse {
    public void printNumberStackReverse() {
        Stack<Integer> stack = new Stack<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число для того чтоб получить стек");
            int number = Integer.parseInt(reader.readLine());
            int tempNumb = number;
            for (int i = 0; i < String.valueOf(number).length(); ++i) {
                int num = tempNumb % 10;
                stack.push(num);
                tempNumb /= 10;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Наше число в обратном порядке из стека");
        System.out.println(stack);
        String result = "";
        int length = stack.size();
        for (int i = 0; i < stack.size(); ++i)
            result = result.concat(String.valueOf(stack.get(i)));
        System.out.println(stack);
        int num = Integer.parseInt(result);
        System.out.println("Наше число в обратном порядке " + num);
    }
}