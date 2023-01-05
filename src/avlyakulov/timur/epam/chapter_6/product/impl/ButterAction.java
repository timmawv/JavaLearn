package avlyakulov.timur.epam.chapter_6.product.impl;

import avlyakulov.timur.epam.chapter_6.product.entity.AbstractProduct;
import avlyakulov.timur.epam.chapter_6.product.entity.Butter;
import avlyakulov.timur.epam.chapter_6.product.entity.ProductAction;

public class ButterAction implements ProductAction<Butter> {

    public void increaseForFatPercent(AbstractProduct product) {
        product.setFatPercent(product.getFatPercent() + 10);
    }
}
