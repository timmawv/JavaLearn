package avlyakulov.timur.epam.chapter_12.example.flow_control;

public class YieldMain {
    //задержка потока на квант времени
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("start 1");
            Thread.yield();
            Thread.yield();
            System.out.println("end 1");
        }).start();
        new Thread(() -> {
            System.out.println("start 2 ");
            System.out.println("end 2 ");
        }).start();
    }
}