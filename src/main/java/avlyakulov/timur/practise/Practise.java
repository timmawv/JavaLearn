package avlyakulov.timur.practise;


import java.util.concurrent.ExecutionException;

public class Practise {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("IT is start");
            int num = 25 * 25;
            System.out.println("our num is " + num);
        });
        thread.start();
    }
}