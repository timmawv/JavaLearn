package avlyakulov.timur.epam.chapter_6.sweet.entity;

import avlyakulov.timur.epam.chapter_6.sweet.entity.sweet.Candy;

/*
Конфеты. Возможности: выпустить партию конфет; получить информа-
цию по продукции определенного производителя; добавить и редактиро-
вать информацию о продукции; добавить новые ингредиенты; создать но-
вый тип конфет; снять с производства определенный тип конфет. Добавить
специализированные методы для Конфеты, Шоколад, Леденец, Ирис.
 */
public interface ProductionOfSweet {

    void releaseBatchOfCandy(Candy[] candies);
    void getInformationAboutSpecificProducer (ProductionOfSweet productionOfSweet);
    Candy createNewTypeSweet(ProducerOfSweets producer,Ingredient[] ingredients,String name);
    void getInformationAboutProduction();
    void withdrawFromProduction(String nameCandy);
}