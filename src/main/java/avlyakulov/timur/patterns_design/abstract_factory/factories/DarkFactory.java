package avlyakulov.timur.patterns_design.abstract_factory.factories;

import avlyakulov.timur.patterns_design.abstract_factory.warriors.Unit;
import avlyakulov.timur.patterns_design.abstract_factory.warriors.WarriorLight;

public class DarkFactory extends AbstractFactoryUnits{
    public DarkFactory() {
        System.out.println("We are dark side");
    }
    @Override
    public Unit createWarrior() {
        System.out.println("Creating Dark Warrior");
        return new WarriorLight();
    }

    @Override
    public Unit createGoblin() {
        System.out.println("Creating Dark Goblin");
        return new WarriorLight();
    }
}
