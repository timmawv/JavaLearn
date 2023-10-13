package avlyakulov.timur.patterns_design.fabric_method.coffee.factory;

import avlyakulov.timur.patterns_design.fabric_method.coffee.coffee_product.Coffee;
import avlyakulov.timur.patterns_design.fabric_method.coffee.coffee_product.CoffeeType;

public abstract class AbstractSimpleCoffeeFactory {
//Хотя все могло быть еще проще, если сделать метод createCoffee статичным. Но тогда мы потеряли бы две возможности:
//Наследоваться от SimpleCoffeeFactory и переопределять метод createCoffee.
//Внедрять нужную реализацию фабрики в наши классы.
//Кстати о внедрении. Нам нужно вернуться в кофейню и внедрить нашу фабрику по созданию кофе.


    public abstract Coffee createCoffee(CoffeeType type);

}
