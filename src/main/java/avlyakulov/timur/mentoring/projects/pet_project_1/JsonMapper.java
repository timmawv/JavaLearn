package avlyakulov.timur.mentoring.projects.pet_project_1;

import lombok.ToString;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class JsonMapper {

    public static Object readFromString(String raw, Class<?> clazz) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
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
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);

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

        User user = (User) JsonMapper.readFromString(rawString, User.class);
        System.out.println(user);
    }
}


@ToString
class User {
    private String name;
    private int year;
    private boolean isAdmin;
}