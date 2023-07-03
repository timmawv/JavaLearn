package avlyakulov.timur.epam.application_1.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLogMain {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        try {
            factorial(9);
            factorial(-3);
        } catch (IllegalArgumentException e) {
            logger.log(Level.ERROR, "negative argument: " + e);
        }
    }

    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("argument " + n + " less than zero");
        logger.log(Level.DEBUG, "Argument n is " + n);
        int result = 1;
        for (int i = n; i >= 1; --i) {
            result *= i;
        }
        logger.log(Level.INFO, "Result is " + result);
        return result;
    }
}
