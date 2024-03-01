package avlyakulov.timur.practise_tasks.wildcard.animals;

public class Horse extends Animal {

    private final boolean abilityToSwim;

    public Horse() {
        abilityToSwim = false;
    }

    @Override
    public boolean getAbilityToSwim() {
        return abilityToSwim;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "abilityToSwim=" + abilityToSwim +
                '}';
    }
}