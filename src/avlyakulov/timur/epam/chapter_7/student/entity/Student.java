package avlyakulov.timur.epam.chapter_7.student.entity;

import java.util.Objects;

/*
Написать класс Студент с полями имя, возраст. Создать массив Студентов.
Выполнить сортировку по оценке выше 8 баллов и сортировать результат
по имени.
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }
    public int getAge () {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}