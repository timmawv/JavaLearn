package avlyakulov.timur.epam.chapter_6.product.entity;

/*
Товар (Product). Возможности: добавить товар; получить данные о товаре:
id, наименование, цена, срок хранения
изменить данные о товаре; переместить товар на склад, переместить товар
в торговый зал; оплатить товар; списать товар. Добавить специализирован-
ные методы для масла, молока, творога.
 */
public interface ProductAction<T extends AbstractProduct> {
    default void changePlaceHold(AbstractProduct product) {
        if (product.getPlace().equals("WareHouse"))
            product.setPlace("Shopping room");
        else
            product.setPlace("WareHouse");
    }

}