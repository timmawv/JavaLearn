package avlyakulov.timur.epam.application_2.test;

import java.util.List;

public class CelsiusMain {
    public static void main(String[] args) {
        String data = new DataReader().read("data/celsius.txt");
        System.out.println(data);
        List<Double> doubleList = new DataParser().parseData(data);
        System.out.println(doubleList);
        Converter converter = new Converter();
        doubleList.stream()
                .filter(c -> converter.checkCelsius(c))
                .forEach(c -> System.out.println(c + " " + converter.convertCelsiusToFahrenheit(c)));
    }
}
