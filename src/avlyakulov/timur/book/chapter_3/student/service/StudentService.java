package avlyakulov.timur.book.chapter_3.student.service;

import avlyakulov.timur.book.chapter_3.student.dao.StudentDao;
import avlyakulov.timur.book.chapter_3.student.entity.Student;

public class StudentService {
    private final StudentDao studentDao = new StudentDao();

    public void create(Student student) {
        studentDao.create(student);
    }
    public Student[] findByFaculty (String faculty) {
        return studentDao.findByFaculty(faculty);
    }
    public Student[] sortByCourseAndFaculty (String faculty,int course) {
        return studentDao.sortByCourseAndFaculty(faculty,course);
    }
    public Student[] findByYear (String dateBirth) {
        return studentDao.findByYear(dateBirth);
    }
    public Student[] listOfGroup (String group) {
        return studentDao.listOfGroup(group);
    }
    public Student[] findAll () {
        return studentDao.findAll();
    }
}
