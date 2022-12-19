package avlyakulov.timur.epam.chapter_6.train.entity;
/*
Вагон. Возможности: получить или изменить различную информацию
о вагоне: регистрационный номер вагона, пункт назначения, владелец, ста-
тус (загрузка, разгрузка, в пути, в ремонте, готов к отправке, требуется ре-
монт); узнать снаряженную массу; отправить в пункт назначения; обслу-
жить; отремонтировать; загрузить; разгрузить; узнать хрупкость/ценность
груза. Добавить дополнительные возможности для грузового и пассажир-
ского вагонов.
 */
public class Carriage {
    String registrationNumber;
    Destination destination;
    Owner owner;
    Status status;

    public Carriage (String registrationNumber,Destination destination,Owner owner,Status status) {
        this.registrationNumber = registrationNumber;
        this.destination = destination;
        this.owner = owner;
        this.status = status;
    }
}