package avlyakulov.timur.epam.chapter_4.transport.entity;

/*
Транспорт. Определить иерархию подвижного состава железнодорожного
транспорта. Создать пассажирский поезд. Подсчитать общую численность
пассажиров и багажа. Провести сортировку вагонов поезда на основе уров-
ня комфортности. Найти в поезде вагоны, соответствующие заданному ди-
апазону параметров числа пассажиров.
 */
public class Train  {

    private ReservedSeat[] railwayCarriages;
    private int current;

    public Train () {
        railwayCarriages = new ReservedSeat[10];
    }
    public void addToTrainCarriage (ReservedSeat reservedSeat) {
        if (current == railwayCarriages.length) {
            ReservedSeat[] railwayCarriages1 = new ReservedSeat[railwayCarriages.length + 1];
            System.arraycopy(railwayCarriages, 0, railwayCarriages1, 0, railwayCarriages1.length);
            railwayCarriages = railwayCarriages1;
        }
        railwayCarriages[current] = reservedSeat;
        current++;
    }


}