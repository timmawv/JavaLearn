package avlyakulov.timur.patterns_design.fabric_method.coffee;

import avlyakulov.timur.patterns_design.fabric_method.coffee.coffee_product.CoffeeType;
import avlyakulov.timur.patterns_design.fabric_method.coffee.factory.SimpleAmericanCoffeeFactory;
import avlyakulov.timur.patterns_design.fabric_method.coffee.factory.SimpleItalianCoffeeFactory;
import avlyakulov.timur.patterns_design.fabric_method.coffee.shop.AmericanCoffeeShop;
import avlyakulov.timur.patterns_design.fabric_method.coffee.shop.CoffeeShop;
import avlyakulov.timur.patterns_design.fabric_method.coffee.shop.ItalianCoffeeShop;
import avlyakulov.timur.patterns_design.fabric_method.coffee.shop.SpainCoffeeShop;

public class Main {
    public static void main(String[] args) {

        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);


        AmericanCoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.AMERICANO);

        SpainCoffeeShop spainCoffeeShop = new SpainCoffeeShop();
        spainCoffeeShop.orderCoffee(CoffeeType.ESPRESSO);
    }
}
