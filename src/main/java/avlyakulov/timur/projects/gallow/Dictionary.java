package avlyakulov.timur.projects.gallow;

import java.util.List;
import java.util.Random;

public class Dictionary {
    private List<String> words = List.of("победа", "машина", "компьютер", "универститет", "дневник", "семья", "мультиварка", "кресло", "диван");

    public String chooseRandWord() {
        int num = new Random().nextInt(0, words.size());
        return words.get(num);
    }
}