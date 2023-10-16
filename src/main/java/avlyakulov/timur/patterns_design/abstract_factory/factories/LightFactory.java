package avlyakulov.timur.patterns_design.abstract_factory.factories;

import avlyakulov.timur.patterns_design.abstract_factory.warriors.Unit;
import avlyakulov.timur.patterns_design.abstract_factory.warriors.WarriorLight;

public class LightFactory extends AbstractFactoryUnits{
    public LightFactory() {
        System.out.println("We are light side");
    }
    @Override
    public Unit createWarrior() {
        System.out.println("Creating Light Warrior");
        return new WarriorLight();
    }

    @Override
    public Unit createGoblin() {
        System.out.println("Creating Light Goblin");
        return new WarriorLight();
    }


}
