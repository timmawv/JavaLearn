package avlyakulov.timur.epam.chapter_12.example.ex.synchr;

public class SynchrExample {
    public static void main(String[] args) {
        Resource resource = new Resource(5);
        ThreadEx myThread = new ThreadEx();
        myThread.setName("one");
        ThreadEx myThread2 = new ThreadEx();
        myThread.setResource(resource);
        myThread2.setResource(resource);
        myThread.start();
        myThread2.start();
        try {
            myThread.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(resource.getI());

    }
    //есть ресурсы которые могут использовать 2 потока одновременно
}

class ThreadEx extends Thread {
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
    }
}

class Resource {
    private int i;

    public Resource(int i) {
        this.i = i;
    }

    /*public void changeI() {
     *//*int i = this.i;
        //thread 1
        int i = this.i;
        //i = 5;
        //thread 2
        int i = this.i;
        //thread 2
        //i = 5
        ++i;
        //thread 2  i = 6;
        this.i = i;//i = 6;
        //thread 1
        //i = 5;
        ++i;*//*
        //thread 1 i = 6
        //пробелма в том что 2 потока могу заходить сюда и савить свои какие то значения, после того как 1 поток выполнится зайдет 2 и поставит свои значения
        int i = this.i;
        if (Thread.currentThread().getName().equals("one"))
            Thread.yield();//сейчас по идее 1 поток отдаст свои ресурсы 2 потоку
        ++i;
        this.i = i;
        //тут в итоге может вывестись 6 та как 1 поток зашел отдал ресурсы 2, он так сказать начал свою работу, отработал получил 6 и завершился
        //но 1 поток та сказать был в пуле потоков теперь он зашел обратно со своим значением 5 просто увеличил его на 1 и мы получаем 6 вместо 7
        //данная проблема решается с помощью синхронизации
    }*/
    public synchronized void changeI() {
        int i = this.i;
        if (Thread.currentThread().getName().equals("one"))
            Thread.yield();//сейчас по идее 1 поток отдаст свои ресурсы 2 потоку
        ++i;
        this.i = i;
        //ключевое слово synchronized - она говорит то что этот метод долженн быть синхронизирован он недолжен прерываться, допустим, наш поток прервался
        //благодаря этому слову ни 1 другой поток не может заходить в данный метод, пока тот не завершит свое выполнение
        //работает с помощью Lock - типо ключик, пока он у вас есть никто другой не сможет открыть вашу ячейку, еще называют Monitor
        //между ними разница минимальная
        //пример блока синхронизации
        synchronized (this) {
            //some code
            System.out.println("Hello from block synchronized");
        }
        //все методы которые меняют значения должны быть синхронизированы

    }

    public int getI() {
        return i;
    }
}