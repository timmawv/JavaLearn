package avlyakulov.timur.epam.chapter_12.example.priority;

import avlyakulov.timur.epam.chapter_12.example.thread.TalkThread;
import avlyakulov.timur.epam.chapter_12.example.thread.WalkThread;

public class PriorityMain {
    // threads with priorities
    public static void main(String[] args) {
        Thread walkMin = new Thread(new WalkThread(), "Min");
        Thread talkMax = new Thread(new TalkThread(),"Max");
        walkMin.setPriority(Thread.MIN_PRIORITY);
        talkMax.setPriority(Thread.MAX_PRIORITY);
        talkMax.start();
        walkMin.start();
    }
}