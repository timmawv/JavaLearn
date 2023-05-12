package avlyakulov.timur.practise;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age,String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void talkToCrowd () {
        System.out.println("Hello i am student");
    }

    public int getAge () {
        return age;
    }

    public String getName () {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
}