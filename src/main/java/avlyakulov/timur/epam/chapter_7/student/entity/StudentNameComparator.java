package avlyakulov.timur.epam.chapter_7.student.entity;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        return String.CASE_INSENSITIVE_ORDER.compare(st1.getName(),st2.getName());
    }
}
