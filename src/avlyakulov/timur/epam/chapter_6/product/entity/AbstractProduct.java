package avlyakulov.timur.epam.chapter_6.product.entity;
/*
Товар (Product). Возможности: добавить товар; получить данные о товаре:
id, наименование, цена, срок хранения
изменить данные о товаре; переместить товар на склад, переместить товар
в торговый зал; оплатить товар; списать товар. Добавить специализирован-
ные методы для масла, молока, творога.
 */
public class AbstractProduct {
    protected int id;
    protected int cost;
    protected String place;
    protected int fatPercent;

    public void setPlace (String place) {
        this.place = place;
    }

    public void setFatPercent (int fatPercent) {
        this.fatPercent = fatPercent;
    }
    public int getFatPercent () {
        return fatPercent;
    }
    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", cost=" + cost +
                ", place='" + place + '\'' +
                ", fatPercent=" + fatPercent +
                '}';
    }
}
