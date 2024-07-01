package avlyakulov.timur.mentoring.projects.pet_project_1;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonMapper {

    public static <T> T readFromString(String json, Class<T> clazz) {
        String[] jsonLines = splitJsonForLines(json);
        Map<String, String> jsonKeyValue = fillMapWithJsonValues(jsonLines);
        return setFieldsToObject(jsonKeyValue, clazz);
    }

    public static String[] splitJsonForLines(String json) {
        String rawString = json.replace("{", "").replace("}", "").trim();
        return rawString.split("\n");
    }

    public static Map<String, String> fillMapWithJsonValues(String[] lines) {
        Map<String, String> map = new HashMap<>();
        for (String str : lines) {
            str = str.replaceAll("[\",]", "").trim();
            String[] entry = str.split(":");
            if (entry.length == 2) {
                map.put(entry[0].trim(), entry[1].trim());
            }
        }
        return map;
    }

    public static <T> T setFieldsToObject(Map<String, String> jsonKeyValue, Class<T> clazz) {
        T obj;
        try {
            obj = clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Error with creating object");
        }
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                if (field.getType() == int.class || field.getType() == Integer.class) {
                    String value = jsonKeyValue.get(field.getName());
                    field.setInt(obj, Integer.parseInt(value));
                }
                if (field.getType() == boolean.class || field.getType() == Boolean.class) {
                    String value = jsonKeyValue.get(field.getName());
                    field.setBoolean(obj, Boolean.parseBoolean(value));
                }
                if (field.getType() == String.class) {
                    String value = jsonKeyValue.get(field.getName());
                    field.set(obj, value);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error with access to field");
            }
        }
        return obj;
    }

    public static void main(String[] args) {
        String json = """
                {
                  "name": "Timur",
                  "year": 22,
                  "isAdmin": true
                }
                                """;

        User user = JsonMapper.readFromString(json, User.class);
        System.out.println(user);
    }
}


@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
class User {
    private String name;
    private int year;
    private boolean isAdmin;
}