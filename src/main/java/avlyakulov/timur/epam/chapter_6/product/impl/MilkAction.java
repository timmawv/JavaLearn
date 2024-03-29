package avlyakulov.timur.epam.chapter_6.product.impl;

import avlyakulov.timur.epam.chapter_6.product.entity.Milk;
import avlyakulov.timur.epam.chapter_6.product.entity.ProductAction;

public class MilkAction implements ProductAction<Milk> {
    public void decreaseFatPercent (Milk milk) {
        milk.setFatPercent(milk.getFatPercent() - 10);
    }
}