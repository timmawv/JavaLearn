package avlyakulov.timur.practise_tasks;

//реализицая чисел фибоначчи
public class NumbersFibonacci {
    public static void main(String[] args) {
        System.out.println("Numbers of Fibonacci ");
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i < 10; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }
}
