package avlyakulov.timur.practise.annotations;

import java.beans.Transient;
import java.lang.annotation.*;

public class AnnotationsExample {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.i);
    }
}

//для чего нужны аннотации, для спринга, хибернейт, для пометки классов и методов, в зависимости от аннотаций будут выполняться разные методы
@Deprecated//данную анотацию можно добавить к классу методу конструктору к полю,также можно добавлять к параметрам метода и к локальным переменам
class MyClass {
    @MyAnn(i = 2)
    int i;

    @MyAnn
    public MyClass() {

    }

    @Transient
    @Deprecated
    public void method(@Deprecated int i) {
        @Deprecated
        int j;
    }
}

class MyClass2 extends MyClass {

}

//пример создания аннотации. К аннотациям можно применять аннотации
@Inherited
//позволяет нашей кастомной аннотацией наследоваться классами. Допустим есть класс MyClass он юзает аннотацию MyAnn, то и MyClass2 тоже будет юзать
//ту аннотацию та как стоит @Inherited, но если мы уберем ее, то MyClass2 не будет наследовать ту аннотацию придется руками писать. Она будет по всему дереву насследования
@Retention(RetentionPolicy.RUNTIME)
//то где будет видна наша аннотация.Она будет видна при запуске. RetentionPolicy.RUNTIME - будет видна в скомилированом классе
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.CONSTRUCTOR})//данная аннотация дает разрешения на область применения данных аннотаций, то есть на поле, локал переменую
//на класс. Данная анотация позволяет контролировать область приминения
@interface MyAnn {
    boolean run() default true;

    int i() default 1;
    //String value();
}

@interface BugReport {//что можно в виде значений туда положить

    enum Status {UNCONFIRMED, CONFIRMED, FIXED, NOTABUG}//это как статус enum

    boolean showStopper() default false;//любой примитивный тип

    String assignedTo() default "[none]";//должно быть только константное значение нельзя чтоб во время компиляции оно вычислялось

    //String assigned3To() default "mayka" + new String(" nike");//так нельзя та как во время компиляции вычисляется значение, но просто сконтатенировать можно
    //также нельзя null добавлять

    String assignedToSomething() default "";

    int i() default 1 + 1;

    Class<?> testCase() default Void.class;//также это может быть специальный класс

    BugReport.Status status() default Status.UNCONFIRMED;//также могут быть значения enum

    //Reference ref() default @Reference();//an annotation type. Также можно принимать аннотации
    String[] reportedBy();//также можно передавать массивы
    //Object o();//запрещено объект. Любой класс нельзя сюда передать, АБСОЛЮТНО ЛЮБОЙ. ОБЪЕКТЫ ЗАПРЕЩЕНЫ
}