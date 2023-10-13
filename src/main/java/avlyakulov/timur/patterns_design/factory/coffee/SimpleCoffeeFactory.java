package avlyakulov.timur.patterns_design.factory.coffee;

public class SimpleCoffeeFactory {
//Хотя все могло быть еще проще, если сделать метод createCoffee статичным. Но тогда мы потеряли бы две возможности:
//Наследоваться от SimpleCoffeeFactory и переопределять метод createCoffee.
//Внедрять нужную реализацию фабрики в наши классы.
//Кстати о внедрении. Нам нужно вернуться в кофейню и внедрить нашу фабрику по созданию кофе.


    public Coffee createCoffee(CoffeeType type) {
        switch (type) {
            case AMERICANO -> {
                return new Americano();
            }
            case ESPRESSO -> {
                return new Espresso();
            }
            case CAPPUCCINO -> {
                return new Cappuccino();
            }
            case CAFFE_LATTE -> {
                return new CaffeLatte();
            }
            default -> {
                return null;
            }
        }
    }

}
