package avlyakulov.timur.practise_tasks.wildcard.animals;

public class Fish extends Animal {
    private final boolean abilityToSwim;

    public Fish() {
        abilityToSwim = true;
    }

    @Override
    public boolean getAbilityToSwim() {
        return abilityToSwim;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "abilityToSwim=" + abilityToSwim +
                '}';
    }
}