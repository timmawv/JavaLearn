package avlyakulov.timur.patterns_design.fabric_method.coffee.factory;

import avlyakulov.timur.patterns_design.fabric_method.coffee.coffee_product.*;

public class SimpleItalianCoffeeFactory extends AbstractSimpleCoffeeFactory {

    @Override
    public Coffee createCoffee(CoffeeType type) {
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
