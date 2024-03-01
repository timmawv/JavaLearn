package avlyakulov.timur.practise_tasks.reflection;

import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //3 способа получить объект класса с которым можно потом в будущем работать
        SomeClass someClass = new SomeClass();
        Class clss = someClass.getClass();
        /*Class clss2 = SomeClass.class;
        Class clss3 = Class.forName("avlyakulov.timur.practise.reflection.ReflectionExample");
        SomeClass someClass1 = (SomeClass) clss.newInstance();*/

        //разница между обычным и declared.Обычный выдает все методы которые есть у текущего класса, по идее видит только public. Declared - выдает только все объявленные(private,protected)
        /*Constructor[] constructors = clss.getConstructors();//мы получаем наши конструкторы
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }*/
        System.out.println("Constructors");
        Constructor[] constructors1 = clss.getDeclaredConstructors();//этот видит абсолютно все конструкторы что есть в нашем коде
        for (Constructor constructor : constructors1) {
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }
        System.out.println();

        System.out.println("Methods:");
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
            //method.getModifiers();//возвращает число которое значит какой модификатор используется
            System.out.println(Modifier.toString(method.getModifiers()));//public synchronized
            System.out.println(method.getReturnType().getName());
            method.invoke(someClass, "test");//запускает наш метод в который мы передали какое то значение
        }

        System.out.println();

        System.out.println("Fields");
        Field[] fields = clss.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
            field.setAccessible(true); //разрешаем доступ к значениям поля после чего все работает
            System.out.println("До изменения поля");
            System.out.println(field.getInt(someClass));//нет доступа к приватным полям
            field.setInt(someClass, 5);
            System.out.println("После изменения поля");
            System.out.println(field.getInt(someClass));//нет доступа к приватным полям
        }
    }
}

//допустим этот класс лежит где то как библиотека и нам нужно получить доступ к нему
//мы хотим обработать его и улучшить что то с ним делать
//Рефлексия - позволяет залезть в класс получить доступ ко всем его полям, ко всем методам, вывести их, обработать их каким то образом.Позволяет заглянуть внутрь класса
class SomeClass {
    private int i;
    //String s;

    SomeClass(String s) {
        //this.s = s;
    }

    public SomeClass() {

    }

    public synchronized String someMethod(String s) {
        System.out.println("this is " + s);
        return s;
    }
}