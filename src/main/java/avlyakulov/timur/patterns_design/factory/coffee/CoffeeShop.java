package avlyakulov.timur.patterns_design.factory.coffee;

public class CoffeeShop {
    //пример с внедрением фабрики
    private final SimpleCoffeeFactory coffeeFactory;

    public CoffeeShop(SimpleCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);

        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Here is your coffee take it!");
        return coffee;
    }
}
