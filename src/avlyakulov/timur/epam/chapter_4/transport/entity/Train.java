package avlyakulov.timur.epam.chapter_4.transport.entity;

import avlyakulov.timur.epam.chapter_3.book.entity.Book;

/*
Транспорт. Определить иерархию подвижного состава железнодорожного
транспорта. Создать пассажирский поезд. Подсчитать общую численность
пассажиров и багажа. Провести сортировку вагонов поезда на основе уров-
ня комфортности. Найти в поезде вагоны, соответствующие заданному ди-
апазону параметров числа пассажиров.
 */
public class Train <T extends RailwayCarriage> {

    private RailwayCarriage[] railwayCarriages;
    private int current;

    public Train () {
        railwayCarriages = new RailwayCarriage[10];
    }
    public void addToTrainCarriage (T t) {
        if (current == railwayCarriages.length) {
            RailwayCarriage[] railwayCarriages1 = new RailwayCarriage[railwayCarriages.length + 1];
            System.arraycopy(railwayCarriages, 0, railwayCarriages1, 0, railwayCarriages1.length);
            railwayCarriages = railwayCarriages1;
        }
        railwayCarriages[current] = t;
        current++;
    }
}