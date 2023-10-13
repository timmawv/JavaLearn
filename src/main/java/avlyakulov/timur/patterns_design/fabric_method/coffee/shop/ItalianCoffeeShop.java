package avlyakulov.timur.patterns_design.fabric_method.coffee.shop;

import avlyakulov.timur.patterns_design.fabric_method.coffee.coffee_product.*;
import avlyakulov.timur.patterns_design.fabric_method.coffee.factory.SimpleItalianCoffeeFactory;

public class ItalianCoffeeShop extends CoffeeShop{

    @Override
    public Coffee createCoffee(CoffeeType type) {
        System.out.println("Готовим ваш кофе по итальянскому стилю");
        switch (type) {
            case AMERICANO -> {
                return new ItalianStyleAmericano();
            }
            case ESPRESSO -> {
                return new ItalianStyleEspresso();
            }
            case CAPPUCCINO -> {
                return new ItalianStyleCappuccino();
            }
            case CAFFE_LATTE -> {
                return new ItalianStyleCaffeLatte();
            }
            default -> {
                return null;
            }
        }
    }
}
