package avlyakulov.timur.epam.chapter_12.example.ex.volat;

public class VolatileEx {
    volatile static int i; //При использовании гарантируется, что все потоки будут читать и записывать значения переменной напрямую в память, а не кэшировать их в локальных регистрах процессора.
    //то есть изменения будут происходить не локально в потоке а уже в оригинальную перемную в памяти

    public static void main(String[] args) {
        new MyThreadRead().start();
        new MyThreadWrite().start();
    }

    static class MyThreadWrite extends Thread {
        @Override
        public void run() {
            while (i < 5) {
                System.out.println("Increment i to " + (++i));
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class MyThreadRead extends Thread {
        @Override
        public void run() {
            //без volatile мы просто зашли создали копию переменной и теперь будет бесконечно выполнятся цикл та как i будет 0 или 1 - в случае если 1 поток быстрее
            //отработает, но когда пишем volatile то мы работаем на прямую уже с перемнной
            int localVar = i;
            while (localVar < 5) {
                if (localVar != i) {
                    System.out.println("New value of i is " + i);
                    localVar = i;
                }
            }
        }
    }
}