package avlyakulov.timur.self_practise.other.hibernate.util;

public class CapitalizeFirstLetter {
    public static String capitalizeFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
}
