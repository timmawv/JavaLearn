package avlyakulov.timur.practise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Practise {

    public static void main(String[] args) {
        double sum = 73644177062.0;
        double num = 9999999.0;
        //7364.418442641844
        //7364.4184426418442642
        System.out.println(sum/num);

        BigDecimal value = new BigDecimal("1234.56789");

        // Округление до 2 знаков после запятой с использованием HALF_UP
        BigDecimal roundedValue = value.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Округленное значение: " + roundedValue);

        // Другие примеры
        BigDecimal roundedDown = value.setScale(2, RoundingMode.DOWN);
        BigDecimal roundedHalfEven = value.setScale(2, RoundingMode.HALF_EVEN);

        System.out.println("Округленное вниз: " + roundedDown);
        System.out.println("Округленное с использованием HALF_EVEN: " + roundedHalfEven);
    }
}
