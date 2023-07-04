package avlyakulov.timur.epam.application_1.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.MapMessage;

public class LogMapMessageMain {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        MapMessage mapMessage = new MapMessage().with("\nId", "LogMapMessageMain");
        try {
            mapMessage.with("\nattepmt1",7);
            factorial(7);
            mapMessage.with("\nattepmt2",-3);
            factorial(-3);
        } catch (IllegalArgumentException e) {
            mapMessage.with("\nException", e);
        }
        logger.info(mapMessage);
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("argument " + n + " less than zero");
        }
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }
}
