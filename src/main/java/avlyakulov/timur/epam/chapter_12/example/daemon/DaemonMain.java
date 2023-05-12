package avlyakulov.timur.epam.chapter_12.example.daemon;

public class DaemonMain {
    public static void main(String[] args) {
        SimpleThread normal = new SimpleThread();
        SimpleThread daemon = new SimpleThread();
        daemon.setDaemon(true);
        daemon.start();
        normal.start();
        System.out.println("end of main");
    }
    //вывод: потоки демоны завершаются вместе с главным потоком (main)
    //если время их задержки будет мало, то они могут завершить работу
}