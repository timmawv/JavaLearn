package avlyakulov.timur.practise.wildcard.animals;

import java.util.List;

//Напишите метод, который принимает список животных и возвращает список животных, которые могут плавать.
public class AnimalsFilter {
    public List<? extends Animal> filterAnimals(List<? extends Animal> list) {
        return list.stream()
                .filter(Animal::getAbilityToSwim)
                .toList();
    }
}
