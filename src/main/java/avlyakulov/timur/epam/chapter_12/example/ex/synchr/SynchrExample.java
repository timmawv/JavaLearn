package avlyakulov.timur.epam.chapter_12.example.ex.synchr;

public class SynchrExample {
    public static void main(String[] args) {
        ThreadEx thread1 = new ThreadEx();
        ThreadEx thread2 = new ThreadEx();
        thread1.setName("one");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Resource.getNum());
        //пояснение по поводу метода join() - для чего штука нужна, та как в этой программе мы создали 2 потока то они работают себе, после этого выводим число
        //если нет нашего метода join - то 3 поток main выведит все раньше и мы не увидим изменений, благодаря join мы ждем выполнение этих потоков и только потом
        //мы принтим результат.
    }
    //есть ресурсы которые могут использовать 2 потока одновременно
}

class ThreadEx extends Thread {

    @Override
    public void run() {
        Resource.changeNum();
    }
}

class Resource {
    private int i;

    private static int num = 5;

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


    //static methods
    public synchronized static void changeNum() {
        int num = Resource.num;
        if (Thread.currentThread().getName().equals("one"))
            Thread.yield();
        ++num;
        Resource.num = num;
    }

    public static int getNum() {
        return num;
    }
}