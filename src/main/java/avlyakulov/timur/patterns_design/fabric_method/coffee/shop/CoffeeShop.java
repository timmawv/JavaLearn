package avlyakulov.timur.patterns_design.fabric_method.coffee.shop;

import avlyakulov.timur.patterns_design.fabric_method.coffee.coffee_product.Coffee;
import avlyakulov.timur.patterns_design.fabric_method.coffee.coffee_product.CoffeeType;


public abstract class CoffeeShop {

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }

    public abstract Coffee createCoffee(CoffeeType type);
}