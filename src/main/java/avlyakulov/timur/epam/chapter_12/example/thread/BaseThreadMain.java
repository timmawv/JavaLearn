package avlyakulov.timur.epam.chapter_12.example.thread;

public class BaseThreadMain {
    public static void main(String[] args) {
        WalkThread walk = new WalkThread(); // та как мы extend Thread то мы можем создать объект
        Thread talk = new Thread(new TalkThread()); // тут мы имплементируем и передаем наш run();
        walk.start();
        talk.start();
        //в даном случаем работают 3 потока наших 2 и еще main thread.
    }
}