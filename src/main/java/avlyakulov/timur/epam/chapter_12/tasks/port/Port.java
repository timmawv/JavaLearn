package avlyakulov.timur.epam.chapter_12.tasks.port;

import java.util.concurrent.atomic.AtomicLong;

/*
Порт. Корабли заходят в порт для разгрузки/загрузки контейнеров. Число
контейнеров, находящихся в текущий момент в порту и на корабле, должно
быть неотрицательным и превышающим заданную грузоподъемность суд-
на и вместимость порта. В порту работает несколько причалов. У одного
причала может стоять один корабль. Корабль может загружаться у причала,
разгружаться или выполнять оба действия.
 */
public class Port extends Thread {
    AtomicLong numberContainer;

    public Port(AtomicLong numberContainer) {
        this.numberContainer = numberContainer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Number of container in port " + numberContainer);
                Thread.sleep(1_000);
            } catch (InterruptedException e) {

            }
        }
    }
}