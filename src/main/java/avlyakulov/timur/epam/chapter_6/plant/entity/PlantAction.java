package avlyakulov.timur.epam.chapter_6.plant.entity;

import avlyakulov.timur.epam.chapter_6.plant.entity.plants.Plant;

/*
Растение. Возможности: задать и редактировать информацию о растении; по-
лучить информацию об имеющихся растениях в оранжерее/растениях опреде-
ленного вида/месте происхождения; закупить новый вид растений; произвести
полив; задать температуру; установить освещение; выкопать определенный
вид растений (убрать из оранжереи). Добавить специализированные методы
для Кустовое растение, Цветковое растение, Комнатное растение.
 */
public interface PlantAction {
    void setInformationAboutPlant (Plant plant, int index);
    Plant getInformationAboutPlant (int index);
    void addNewTypeOfPlant(Plant plant,int index);
    void waterPlants();
    void removePlant(int index);
}
