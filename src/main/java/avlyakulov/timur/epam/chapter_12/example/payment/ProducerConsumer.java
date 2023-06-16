package avlyakulov.timur.epam.chapter_12.example.payment;

public class ProducerConsumer {
    //поставщик/потребитель
    private boolean ready;

    public synchronized void consume() {
        while (!ready) {
            try {
                wait();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        ready = false;
    }

    public synchronized void produce() {
        ready = true;
        notify();
    }
}