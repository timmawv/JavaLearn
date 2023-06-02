package avlyakulov.timur.epam.chapter_12.example.ex.dead;

public class DeadLockExample {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.resourceA = resourceA;
        myThread2.resourceB = resourceB;
        myThread1.start();
        myThread2.start();
    }
}

class MyThread1 extends Thread {
    ResourceA resourceA;

    @Override
    public void run() {
        System.out.println(resourceA.getI());
    }
}

class MyThread2 extends Thread {
    ResourceB resourceB;

    @Override
    public void run() {
        System.out.println(resourceB.getI());
    }
}

class ResourceB {
    ResourceA resourceA;

    public synchronized int getI() {
        //причины появление дед лока получается так что 1 класс а имеет ссылку на другой класс б, методы синхронайзт, представим 2 потока есть, мы зашли в эти методы
        //1 поток работает и останавливается тут, в этом методе, он уже залочил выполнение этого кода, тогда вступает 2 поток в ресурсе А и там уже не может выполнить
        //код та как класс б залочил нужные методы, но при этом он сам залочил методы того класса и теперь не получается выполнить код, в 1 потоке который остановился
        return resourceA.returnI();
    }

    public synchronized int returnI() {
        return 1;
    }
}

class ResourceA {

    ResourceB resourceB;

    public synchronized int getI() {
        return resourceB.returnI();
    }

    public synchronized int returnI() {
        return 2;
    }
}
