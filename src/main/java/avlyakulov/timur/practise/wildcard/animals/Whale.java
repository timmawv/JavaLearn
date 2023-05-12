package avlyakulov.timur.practise.wildcard.animals;

public class Whale extends Animal {
    private final boolean abilityToSwim;

    public Whale() {
        abilityToSwim = true;
    }

    @Override
    public boolean getAbilityToSwim() {
        return abilityToSwim;
    }

    @Override
    public String toString() {
        return "Whale{" +
                "abilityToSwim=" + abilityToSwim +
                '}';
    }
}