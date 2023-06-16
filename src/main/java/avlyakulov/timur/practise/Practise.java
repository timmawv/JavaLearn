package avlyakulov.timur.practise;


import java.util.concurrent.ExecutionException;

public class Practise {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new Thread(() -> {
           for (int i = 0; i < 10; ++i)
               System.out.println("it is one step " + i);
        }).start();
        System.out.println("End of main thread");
    }
}