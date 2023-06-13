package avlyakulov.timur.epam.chapter_12.example.ex.semofors;

import java.util.concurrent.Semaphore;

public class SemoforExample {
    //семафор это аналог столиков в ресторане, столики это ресурсы, потоки это люди, приходят просят ресурс, если занят ждут, потом получают
    //все просходит по условной очереди, без спешки, каждый получает нужный ресурс
    //семафор помогает одновременно работать с ресурсами, выделяем ресурсы на потоки
    public static void main(String[] args) {
        Semaphore table = new Semaphore(2);
        Person person = new Person();
        Person person2 = new Person();
        Person person3= new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        Person person6 = new Person();
        Person person7 = new Person();

        person.table = table;
        person2.table = table;
        person3.table = table;
        person4.table = table;
        person5.table = table;
        person6.table = table;
        person7.table = table;

        person.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
        person6.start();
        person7.start();
    }
}

class Person extends Thread {
    Semaphore table;

    @Override
    public void run() {
        System.out.println(this.getName() + " waiting for table");
        try {
            table.acquire();
            System.out.println(this.getName() + " eating at the table");
            this.sleep(1000);
            System.out.println(this.getName() + " release table");
            table.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}