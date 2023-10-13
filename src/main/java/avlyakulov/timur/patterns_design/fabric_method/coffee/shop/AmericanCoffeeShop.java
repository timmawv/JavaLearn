package avlyakulov.timur.patterns_design.fabric_method.coffee.shop;

import avlyakulov.timur.patterns_design.fabric_method.coffee.coffee_product.*;
import avlyakulov.timur.patterns_design.fabric_method.coffee.factory.AbstractSimpleCoffeeFactory;
import avlyakulov.timur.patterns_design.fabric_method.coffee.factory.SimpleAmericanCoffeeFactory;

public class AmericanCoffeeShop extends CoffeeShop {


    @Override
    public Coffee createCoffee(CoffeeType type) {
        System.out.println("Готовим ваш кофе по американскому стилю");
        switch (type) {
            case AMERICANO -> {
                return new AmericanStyleAmericano();
            }
            case ESPRESSO -> {
                return new AmericanStyleEspresso();
            }
            case CAPPUCCINO -> {
                return new AmericanStyleCappuccino();
            }
            case CAFFE_LATTE -> {
                return new AmericanStyleCaffeLatte();
            }
            default -> {
                return null;
            }
        }
    }
}
