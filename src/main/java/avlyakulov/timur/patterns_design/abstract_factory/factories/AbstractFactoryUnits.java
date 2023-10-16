package avlyakulov.timur.patterns_design.abstract_factory.factories;

import avlyakulov.timur.patterns_design.abstract_factory.warriors.Unit;

public abstract class AbstractFactoryUnits {
    public abstract Unit createWarrior();
    public abstract Unit createGoblin();
}