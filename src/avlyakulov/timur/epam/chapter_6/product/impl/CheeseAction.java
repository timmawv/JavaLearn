package avlyakulov.timur.epam.chapter_6.product.impl;

import avlyakulov.timur.epam.chapter_6.product.entity.AbstractProduct;
import avlyakulov.timur.epam.chapter_6.product.entity.Cheese;
import avlyakulov.timur.epam.chapter_6.product.entity.ProductAction;

public class CheeseAction implements ProductAction<Cheese> {
    public void increaseCostOfCheese (Cheese cheese) {
        cheese.setCost(cheese.getCost() + 20);
    }
}
