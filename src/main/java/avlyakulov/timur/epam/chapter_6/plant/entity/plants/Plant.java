package avlyakulov.timur.epam.chapter_6.plant.entity.plants;

import avlyakulov.timur.epam.chapter_6.plant.entity.TypeOfPlant;

/*
Растение. Возможности: задать и редактировать информацию о растении; по-
лучить информацию об имеющихся растениях в оранжерее/растениях опреде-
ленного вида/месте происхождения; закупить новый вид растений; произвести
полив; задать температуру; установить освещение; выкопать определенный
вид растений (убрать из оранжереи). Добавить специализированные методы
для Кустовое растение, Цветковое растение, Комнатное растение.
 */
public class Plant {
    String information;
    TypeOfPlant typeOfPlant;
    int waterLevel;

    public Plant (String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "typeOfPlant=" + typeOfPlant +
                ", waterLevel=" + waterLevel +
                '}';
    }
}