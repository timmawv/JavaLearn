package avlyakulov.timur.projects.gallow;

import java.util.List;
import java.util.Random;

public class Dictionary {
    private List<String> words = List.of("массив", "женщина", "кубок", "бассейн", "дерево",
            "победа", "машина", "компьютер", "университет", "дневник", "семья", "мультиварка",
            "кресло", "диван", "ребенок", "пенсия", "цель", "успех", "список", "желание",
            "искушение", "планшет", "театр");

    public String chooseRandWord() {
        int num = new Random().nextInt(0, words.size());
        return words.get(num);
    }
}