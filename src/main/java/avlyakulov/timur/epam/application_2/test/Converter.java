package avlyakulov.timur.epam.application_2.test;

public class Converter {
    private static final int ABSOLUTE_ZERO = -273;


    public double convertCelsiusToFahrenheit(double celsius) {
        if (celsius < ABSOLUTE_ZERO) {
            throw new IllegalArgumentException("error data");
        }
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }

    public boolean checkCelsius(double celsius) {
        return celsius >= ABSOLUTE_ZERO;
    }

    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println(converter.checkCelsius(-300));
    }
}
