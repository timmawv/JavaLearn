package avlyakulov.timur.epam.chapter_6.computer.entity;

/*
Компьютер. Возможности: создать новую модель компьютера; установить
цену; добавить объем оперативной памяти; изменить разрешение экрана;
изменить процессор компьютера; добавить новые комплектующие в базо-
вую комплектацию. Добавить специализированные методы для Computer,
SmartPhone, Pad.
 */
public interface ComputerAction {
    void addRAM(int ram);

}