package avlyakulov.timur.patterns_design.fabric_method.coffee.factory;

import avlyakulov.timur.patterns_design.fabric_method.coffee.coffee_product.*;

public class SimpleAmericanCoffeeFactory extends AbstractSimpleCoffeeFactory {

    @Override
    public Coffee createCoffee(CoffeeType type) {
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
