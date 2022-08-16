package avlyakulov.timur.epam.chapter_3.student.db;

import avlyakulov.timur.epam.chapter_3.student.entity.Student;

import java.util.UUID;
public class StudentDB {
    private Student[] students;
    private int current;
    private static StudentDB instance;

    private StudentDB() {
        students = new Student[10];
    }

    public static StudentDB getInstance() {
        if (instance == null) {
            instance = new StudentDB();
        }
        return instance;
    }

    public void createStudent(Student student) {
        student.setId(generateId());
        if (current == students.length) {
            Student[] students1 = new Student[students.length + 1];
            System.arraycopy(students, 0, students1, 0, students1.length);
            students = students1;
        }
        students[current] = student;
        current++;
    }

    public Student[] findByFaculty(String faculty) {
        int i = 0;
        Student[] students1 = new Student[students.length];
        for (Student student : students)
            if (student!=null)
                if (student.getFaculty().equals(faculty)) {
                    students1[i] = student;
                    ++i;
                }
        return students1;
    }

    public Student[] sortByCourseAndFaculty(String faculty, int course) {
        int i = 0;
        Student[] students1 = new Student[students.length];
        for (Student student : students)
            if (student!=null)
                if (student.getFaculty().equals(faculty) && student.getCourse() == course) {
                    students1[i] = student;
                    ++i;
                }
        return students1;
    }

    public Student[] findByYear(String dateBirth) {
        int i = 0;
        Student[] students1 = new Student[students.length];
        for (Student student : students)
            if (student!=null)
                if (Integer.parseInt(student.getDateBirth()) > Integer.parseInt(dateBirth)) {
                    students1[i] = student;
                    ++i;
                }
        return students1;
    }

    public Student[] listOfGroup(String group) {
        Student[] students1 = new Student[students.length];
        int j = 0;
        for (Student student : students)
            if (student!=null)
                if (student.getGroup().equals(group)) {
                    students1[j] = student;
                    ++j;
                }
        return students1;
    }

    public Student[] findAll() {
        return students;
    }

    public String generateId() {
        return UUID.randomUUID().toString();
    }
}
