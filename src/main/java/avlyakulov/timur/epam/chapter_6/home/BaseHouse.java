package avlyakulov.timur.epam.chapter_6.home;
/*
Дом. Возможности: построить дом; рассчитать цену за квадратный метр;
узнать сколько комнат; увеличить площадь; сдавать дом в аренду; сделать
ремонт (в какой-либо комнате). Добавить специализированные методы для
Дома, Офисного здания, Торгового центра.
 */
public interface BaseHouse {

    void buildHouse();
    int countPriceForSquareMeter();
    int getNumberOfRooms();
    void increaseSquare(int square);
    void rentHouse();
    void makeRepair();
    int getSquare();
}