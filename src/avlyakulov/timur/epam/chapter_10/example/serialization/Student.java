package avlyakulov.timur.epam.chapter_10.example.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    static String faculty = "KN";
    private String name;
    private int id;
    private transient String password;
    private static final long serialVersionUID = 2L;

    public Student () {}
    public Student(String name,int id,String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public static void setFaculty(String faculty) {
        Student.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFaculty() {
        return faculty;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}