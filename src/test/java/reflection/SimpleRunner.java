package reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SimpleRunner {
    public static void main(String[] args) {
        SimpleRunner sr = new SimpleRunner();

        sr.runTests();
    }

    private void runTests() {
        try {
            Class<?> cl = Class.forName("reflection.ReflectionTest");

            Constructor<?> cst = cl.getConstructor();
            Object entity = cst.newInstance();

            Method[] methods = cl.getMethods();

            for (Method m : methods) {
                Test annotation = m.getAnnotation(Test.class);
                if (annotation != null) {
                    m.invoke(entity);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}