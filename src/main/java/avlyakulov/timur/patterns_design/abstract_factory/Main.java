package avlyakulov.timur.patterns_design.abstract_factory;

import avlyakulov.timur.patterns_design.abstract_factory.factories.AbstractFactoryUnits;
import avlyakulov.timur.patterns_design.abstract_factory.factories.DarkFactory;
import avlyakulov.timur.patterns_design.abstract_factory.factories.LightFactory;
import avlyakulov.timur.patterns_design.abstract_factory.warriors.Unit;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryUnits factory = new LightFactory();
        factory.createWarrior();
        factory.createGoblin();
        factory = new DarkFactory();
        factory.createGoblin();
        Unit warrior = factory.createWarrior();
    }
}
