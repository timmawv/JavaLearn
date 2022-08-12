package avlyakulov.timur.book.chapter_3.student.dao;

import avlyakulov.timur.book.chapter_3.student.db.StudentDB;
import avlyakulov.timur.book.chapter_3.student.entity.Student;

public class StudentDao {


    public void create (Student student) {
        StudentDB.getInstance().createStudent(student);
    }

    public Student[] findByFaculty(String faculty) {
        return StudentDB.getInstance().findByFaculty(faculty);
    }
    public Student[] sortByCourseAndFaculty(String faculty, int course) {
        return StudentDB.getInstance().sortByCourseAndFaculty(faculty, course);
    }

    public Student[] findByYear(String dateBirth) {
        return StudentDB.getInstance().findByYear(dateBirth);
    }
    public Student[] listOfGroup (String group) {
        return StudentDB.getInstance().listOfGroup(group);
    }

    public Student[] findAll() {
        return StudentDB.getInstance().findAll();
    }
}
