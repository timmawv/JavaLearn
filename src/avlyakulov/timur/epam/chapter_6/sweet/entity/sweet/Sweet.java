package avlyakulov.timur.epam.chapter_6.sweet.entity.sweet;
import avlyakulov.timur.epam.chapter_6.sweet.entity.Ingredient;
import avlyakulov.timur.epam.chapter_6.sweet.entity.ProducerOfSweets;

/*
Конфеты. Возможности: выпустить партию конфет; получить информа-
цию по продукции определенного производителя; добавить и редактиро-
вать информацию о продукции; добавить новые ингредиенты; создать но-
вый тип конфет; снять с производства определенный тип конфет. Добавить
специализированные методы для Конфеты, Шоколад, Леденец, Ирис.
 */
public class Sweet {
    private ProducerOfSweets producer;
    private Ingredient[] ingredients;

    public Sweet(ProducerOfSweets producer) {
        this.producer = producer;
        ingredients = new Ingredient[]{Ingredient.COCOA,Ingredient.SUGAR,Ingredient.SALT};
    }

}