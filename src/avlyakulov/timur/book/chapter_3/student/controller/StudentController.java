package avlyakulov.timur.book.chapter_3.student.controller;

import avlyakulov.timur.book.chapter_3.student.entity.Student;
import avlyakulov.timur.book.chapter_3.student.service.StudentService;
import avlyakulov.timur.book.chapter_3.user.entity.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentController {
    private final StudentService studentService = new StudentService();

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select your option ");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                position = reader.readLine();
                if (position.equals("0"))
                    System.exit(0);
                crud(position, reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("if you want create student, please enter 1");
        System.out.println("if you want find Student by faculty, please enter 2");
        System.out.println("if you want find Student by faculty and course, please enter 3");
        System.out.println("if you want findByYear Student, please enter 4");
        System.out.println("if you want get list of group by name group, please enter 5");
        System.out.println("if you want get all students, please enter 6");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> create(reader);
            case "2" -> findByFaculty(reader);
            case "3" -> sortByCourseAndFaculty(reader);
            case "4" -> findByYear(reader);
            case "5" -> listOfGroup(reader);
            case "6" -> findAll();
        }
        runNavigation();
    }

    private void create(BufferedReader reader) {
        System.out.println("StudentController.create");
        try {
            System.out.println("Please student your name");
            String name = reader.readLine();
            System.out.println("Please enter student surname");
            String surName = reader.readLine();
            System.out.println("Enter student dateBirth");
            String dateBirth = reader.readLine();
            System.out.println("Enter student address");
            String address = reader.readLine();
            System.out.println("Enter student phoneNumber");
            String phoneNumber = reader.readLine();
            System.out.println("Enter student faculty");
            String faculty = reader.readLine();
            System.out.println("Enter his course");
            String courseString = reader.readLine();
            int course = Integer.parseInt(courseString);
            System.out.println("Enter students group");
            String group = reader.readLine();
            Student student = new Student();
            student.setName(name);
            student.setSurname(surName);
            student.setDateBirth(dateBirth);
            student.setAddress(address);
            student.setPhoneNumber(phoneNumber);
            student.setFaculty(faculty);
            student.setCourse(course);
            student.setGroup(group);
            studentService.create(student);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }
    private void findByFaculty (BufferedReader reader) {
        System.out.println("StudentController.findByFaculty");
        try {
            System.out.println("Enter student faculty to find");
            String faculty = reader.readLine();
            studentService.findByFaculty(faculty);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }
    private void sortByCourseAndFaculty (BufferedReader reader) {
        System.out.println("StudentController.sortByCourseAndFaculty");
        try {
            System.out.println("Enter student course and faculty to find");
            System.out.print("Faculty - ");
            String faculty = reader.readLine();
            System.out.print("Course - ");
            String courseString = reader.readLine();
            int course = Integer.parseInt(courseString);
            studentService.sortByCourseAndFaculty(faculty,course);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }
    private void findByYear (BufferedReader reader) {
        System.out.println("StudentController.findByYear");
        try {
            System.out.println("Enter student dateBirth");
            String yearBirth = reader.readLine();
            studentService.findByYear(yearBirth);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }
    private void listOfGroup (BufferedReader reader) {
        System.out.println("StudentController.listOfGroup");
        try {
            System.out.println("Enter name of group to print all students");
            String groupName = reader.readLine();
            studentService.listOfGroup(groupName);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }
    private void findAll () {
        System.out.println("StudentController.findAll");
        Student[] students = studentService.findAll();
        if (students != null && students.length != 0) {
            for (Student student : students)
                if (student != null)
                    System.out.println("student = " + student);
        } else {
            System.out.println("Students empty");
        }
    }
}