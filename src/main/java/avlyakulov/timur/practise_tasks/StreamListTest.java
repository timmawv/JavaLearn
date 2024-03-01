package avlyakulov.timur.practise_tasks;

import java.util.ArrayList;
import java.util.List;

public class StreamListTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex",12,"ITINF-12"));
        students.add(new Student("Danya",14,"ITINF-12"));
        students.add(new Student("Dima",15,"ITINF-12"));
        students.add(new Student("Ira",10,"ITINF-12"));
        long count = 0;
        System.out.println(students.stream()
                .filter(student -> student.getAge() > 10)
                .map(Student::getName)
                .filter(name -> name.length() > 4)
                .findAny());

        System.out.println(count);
    }
}