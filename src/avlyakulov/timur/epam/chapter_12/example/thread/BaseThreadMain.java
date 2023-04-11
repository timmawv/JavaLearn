package avlyakulov.timur.epam.chapter_12.example.thread;

public class BaseThreadMain {
    public static void main(String[] args) {
        WalkThread walk = new WalkThread(); // new thread object
        Thread talk = new Thread(new TalkThread()); // new thread object
        walk.start(); // start of thread
        talk.start(); // start of thread
        // TalkThread t = new TalkThread(); just an object, not a thread
        // t.run(); talk.run();
        // method will execute, but thread will not start!
    }
}