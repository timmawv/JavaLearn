package avlyakulov.timur.epam.chapter_10.variant_c.task_6;

public enum Types {
    INT,DOUBLE,STRING;


    public static Types getType (String value) {
        Types type = STRING;
        if (getInt(value))
            type = INT;
        else if (getDouble(value))
            type = DOUBLE;
        return type;
    }
    public static boolean getInt (String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    public static boolean getDouble (String value) {
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
