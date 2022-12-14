package avlyakulov.timur.epam.chapter_6.sweet.impl;

import avlyakulov.timur.epam.chapter_6.sweet.entity.ProductionOfSweet;

public class ProductionOfSweetImpl implements ProductionOfSweet {
    ProductionOfSweet[] baseSweets;
    @Override
    public ProductionOfSweet[] releaseBatchOfCandy() {
        return new ProductionOfSweet[0];
    }

    @Override
    public String getInformationAboutSpecificProducer() {
        return null;
    }

    @Override
    public void createNewTypeSweet() {

    }

    @Override
    public void addInformationAboutProduction() {

    }

    @Override
    public void setInformationAboutProduction() {

    }

    @Override
    public void withdrawFromProduction() {

    }
}
