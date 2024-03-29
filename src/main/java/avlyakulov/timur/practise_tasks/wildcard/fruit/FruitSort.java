package avlyakulov.timur.practise_tasks.wildcard.fruit;

import java.util.List;
public class FruitSort {
    public long sortFruitsByWeight(List<? extends Fruit> list) {
        return list.stream()
                .filter(f -> f.getWeight() > 100)
                .count();

    }
}