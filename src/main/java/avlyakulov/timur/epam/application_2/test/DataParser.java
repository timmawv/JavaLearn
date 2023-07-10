package avlyakulov.timur.epam.application_2.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataParser {
    public List<Double> parseData(String data) {
        List<Double> doubles = new ArrayList<>();
        Arrays.stream(data.split("\\s+"))
                .filter(s -> s.matches("-?\\d{1,6}\\.?\\d{0,2}?"))
                .forEach(d -> doubles.add(Double.valueOf(d)));
        return doubles;
    }
}
