package avlyakulov.timur.epam.chapter_12.example.ex.wait_notify;

public class WaitNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        //wait - просто дает потоку отдыхать, типо спать
        ThreadB threadB = new ThreadB();
        threadB.start();
        synchronized (threadB) {
            threadB.wait();//ждет пока поток выполнит всю свою работу и потом по notify он просыпается
        }
        System.out.println(threadB.total);
    }

    static class ThreadB extends Thread {
        int total;

        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 5; ++i) {
                    total += i;
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                notify();
            }
        }
    }
}