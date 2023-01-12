package avlyakulov.timur.epam.chapter_7.student.controller;

import avlyakulov.timur.epam.chapter_7.student.entity.Student;
import avlyakulov.timur.epam.chapter_7.student.entity.StudentNameComparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StudentController {
    StudentNameComparator studentNameComparator = new StudentNameComparator();
    Student[] students = new Student[1];
    public int counter = 0;

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create student press 1");
        System.out.println("If you want to sort by mark more than 8 eight press 2");
        System.out.println("If you want sort by name press 3");
        System.out.println("If you want print all students press 4");
        System.out.println();
    }

    public void crud(BufferedReader reader, String position) {
        switch (position) {
            case "1" -> createStudent(reader);
            case "2" -> System.out.println(Arrays.stream(students).filter(s -> s.getAge()>8).collect(Collectors.toList()));
            //case "3" -> System.out.println( Arrays.stream(students).sorted(Comparator.comparing(s -> s.getName())).collect(Collectors.toList()));
            case "3" -> System.out.println(Arrays.stream(students).sorted(studentNameComparator).collect(Collectors.toList()));
            case "4" -> System.out.println(Arrays.toString(students));
        }
    }

    public void run() {
        runNavigation();
        String position;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((position = reader.readLine()) != null) {
                crud(reader, position);
                runNavigation();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void createStudent(BufferedReader reader) {
        try {
            System.out.println("Enter the name of Student");
            String name = reader.readLine();
            System.out.println("Enter the age of Student");
            int age = Integer.parseInt(reader.readLine());
            Student student = new Student(name, age);
            if (students.length == counter) {
                Student[] students1 = new Student[students.length + 1];
                System.arraycopy(students,0,students1,0,students.length);
                students = students1;
            }
            students[counter] = student;
            ++counter;
        } catch (IOException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }

}