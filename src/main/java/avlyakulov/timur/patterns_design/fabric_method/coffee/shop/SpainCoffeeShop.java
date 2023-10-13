package avlyakulov.timur.patterns_design.fabric_method.coffee.shop;

import avlyakulov.timur.patterns_design.fabric_method.coffee.coffee_product.*;

public class SpainCoffeeShop extends CoffeeShop{

    @Override
    public Coffee createCoffee(CoffeeType type) {
        System.out.println("Готовим ваш кофе по испанскому стилю");
        switch (type) {
            case AMERICANO -> {
                return new SpainAmericano();
            }
            case ESPRESSO -> {
                return new SpainEspresso();
            }
            case CAPPUCCINO -> {
                return new SpainCappuccino();
            }
            case CAFFE_LATTE -> {
                return new SpainCaffeeLatte();
            }
            default -> {
                return null;
            }
        }
    }
}
