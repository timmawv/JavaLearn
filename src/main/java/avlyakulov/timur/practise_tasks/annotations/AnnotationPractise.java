package avlyakulov.timur.practise_tasks.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class AnnotationPractise {
    public static void main(String[] args) throws IllegalAccessException {
        AnnotationPractise annotationPractise = new AnnotationPractise();
        Person person = new Person();
        annotationPractise.print(person, person.getClass());//передаем созданный объект и его класс. Если мы находим аннотацию Show то мы выводим значения поля
    }
    void print(Object o, Class c) throws IllegalAccessException {
        Field[] fields = c.getDeclaredFields();//это пример рефлексии в java
        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().equals(Show.class)) {
                    System.out.println(field.get(o));
                }
            }
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface Show {
    boolean value() default true;

}
class Person {
    @Show// в данный момент мы пометили наше поле @Show, а это значит что при анализе кода java будет видеть только данное поле та как мы его пометили
    String name = "Timur";
    int age = 22;
}