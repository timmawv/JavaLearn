package avlyakulov.timur.epam.chapter_12.example.ex.fork_join;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinExample {
    //ForkJoin - может ускорять наш код с помощью многопоточки
    static long numOfOperations = 10_000_000_000L;
    // у меня не считает. Баг какой то будем считать до ForkJoin оно делает за 7 секунд
    static int numOfThreads = Runtime.getRuntime().availableProcessors();// возвращает количество ядер. У меня получается 8 ядер
    //ForkJoin ускорил до 2 секунд
    public static void main(String[] args) {
        System.out.println(new Date());
        //System.out.println(numOfThreads);
        /*long j = 0;
        for (int i = 0; i < numOfOperations; ++i) {
            j += i;
        }
        System.out.println(j);*/
        ForkJoinPool pool = new ForkJoinPool(numOfThreads);//пул потоков который разделяет задачи. Задача разбивается на пополам и обрабатывается частями.
        //теперь заставим нашу програму использовать все 8 ядер
        System.out.println(pool.invoke(new MyFork(0, numOfOperations)));//сюда передается класс который будет выполнять нашу работу

        System.out.println(new Date());
    }

    static class MyFork extends RecursiveTask<Long> {
        long from, to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        //данный метод выполняет весь подсчет.
        @Override
        protected Long compute() {
            //пример псевдокода
            /*if (если операция разбита на досточное количество частей ) {
                выполняем операцию.
            } else {
                тогда разбиваем на части поменьше
            }*/

            if (to - from <= numOfOperations / numOfThreads) { //мы просто делим на меньшие операции.
                //тут мы делаем наше вычисление
                long j = 0;
                for (long i = from; i < to; i++) {
                    j += i;
                }
                return j;
            } else {
                //тут мы просто разбиваем задачу на мелкие части
                long middle = (to + from) / 2;
                MyFork firstHalf = new MyFork(from, middle);
                firstHalf.fork();
                MyFork secondHalf = new MyFork(middle + 1, to);
                long secondValue = secondHalf.compute();
                return firstHalf.join() + secondValue;
            }
        }
    }
}