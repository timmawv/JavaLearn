package avlyakulov.timur.epam.chapter_6.sweet.entity.sweet;
import avlyakulov.timur.epam.chapter_6.sweet.entity.Ingredient;
import avlyakulov.timur.epam.chapter_6.sweet.entity.ProducerOfSweets;

import java.util.Arrays;

/*
Конфеты. Возможности: выпустить партию конфет; получить информа-
цию по продукции определенного производителя; добавить и редактиро-
вать информацию о продукции; добавить новые ингредиенты; создать но-
вый тип конфет; снять с производства определенный тип конфет. Добавить
специализированные методы для Конфеты, Шоколад, Леденец, Ирис.
 */
public class Sweet extends Candy{

    public Sweet (ProducerOfSweets producer,String name) {
        super(producer,name);
        ingredients = new Ingredient[] {Ingredient.COCOA,Ingredient.SALT,Ingredient.SUGAR};
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "ingredients=" + Arrays.toString(ingredients) +
                "} " + super.toString();
    }
}