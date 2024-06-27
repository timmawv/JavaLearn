package avlyakulov.timur.mentoring.projects.pet_project_1;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class JsonMapper {

    public static <T> T readFromString(String raw, Class<T> clazz) {
        String rawString = raw.replace("{", "").replace("}", "").trim();
        String[] split = rawString.split("\n");
        Map<String, String> map = new HashMap<>();

        for (String str : split) {
            str = str.replaceAll("[\",]", "").trim();
            String[] split1 = str.split(":");
            if (split1.length == 2) {
                map.put(split1[0].trim(), split1[1].trim());
            }
        }
        T obj;
        try {
            obj = clazz.getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException("Error with creating object");
        }
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);

            try {
                if (field.getType() == int.class || field.getType() == Integer.class) {
                    String value = map.get(field.getName());
                    field.setInt(obj, Integer.parseInt(value));
                }
                if (field.getType() == boolean.class || field.getType() == Boolean.class) {
                    String value = map.get(field.getName());
                    field.setBoolean(obj, Boolean.parseBoolean(value));
                }
                if (field.getType() == String.class) {
                    String value = map.get(field.getName());
                    field.set(obj, value);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error with access to field");
            }
        }
        return obj;
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        String rawString = """
                {
                  "name": "Timur",
                  "year": 22,
                  "isAdmin": true
                }
                                """;

        User user = JsonMapper.readFromString(rawString, User.class);
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