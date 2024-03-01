package avlyakulov.timur.practise_tasks;

public class Example {
    public static void changeNum (int a) {
        a = a + 12;
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a = 10;
        changeNum(a);
        System.out.println(a);
    }
}