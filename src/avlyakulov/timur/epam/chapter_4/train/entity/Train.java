package avlyakulov.timur.epam.chapter_4.train.entity;

import java.util.Arrays;

/*
Транспорт. Определить иерархию подвижного состава железнодорожного
транспорта. Создать пассажирский поезд. Подсчитать общую численность
пассажиров и багажа. Провести сортировку вагонов поезда на основе уров-
ня комфортности. Найти в поезде вагоны, соответствующие заданному ди-
апазону параметров числа пассажиров.
 */
public class Train {

    private ReservedSeat[] railwayCarriages;
    private int current;
    private int numberOfPassengers;
    private int weight;

    public Train() {
        railwayCarriages = new ReservedSeat[2];
        railwayCarriages[0] = new Locomotive("P-192");
        ++current;
    }

    public void addToTrainCarriage(ReservedSeat reservedSeat) {
        if (current == railwayCarriages.length) {
            ReservedSeat[] railwayCarriages1 = new ReservedSeat[railwayCarriages.length + 1];
            System.arraycopy(railwayCarriages, 0, railwayCarriages1, 0, railwayCarriages.length);
            railwayCarriages = railwayCarriages1;
        }
        railwayCarriages[current] = reservedSeat;
        current++;
    }

    public void getNumberOfPassengersAndWeight(ReservedSeat[] reservedSeats, int numberOfPassengers, int weight) {
        for (int i = 1; i < reservedSeats.length; ++i) {
            numberOfPassengers += reservedSeats[i].getCapacityPassenger();
            weight += reservedSeats[i].getCapacityBaggage();
        }
        setNumberOfPassengers(numberOfPassengers);
        setWeight(weight);
    }

    public void sortByLevelComfort() {
        for (int i = 0; i < railwayCarriages.length; ++i)
            for (int j = 1; j < railwayCarriages.length - 1; ++j)
                if (railwayCarriages[j].getLevelComfort() > railwayCarriages[j + 1].getLevelComfort()) {
                    ReservedSeat reservedSeat = railwayCarriages[j];
                    railwayCarriages[j] = railwayCarriages[j + 1];
                    railwayCarriages[j + 1] = reservedSeat;
                }
    }
    public void printCarriagesFromDiapason (int pasBegin, int pasEnd, int weightBegin, int weightEnd) {
        for (ReservedSeat reservedSeat : railwayCarriages) {
            int numPas = reservedSeat.getCapacityPassenger();
            int numBaggage = reservedSeat.getCapacityBaggage();
            if ( (numPas > pasBegin && numPas < pasEnd) && (numBaggage > weightBegin && numBaggage < weightEnd))
                System.out.println(reservedSeat);
        }
    }

    public ReservedSeat[] getAll() {
        return railwayCarriages;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Train {" +
                "railwayCarriages = " + Arrays.toString(railwayCarriages) +
                '}';
    }
}