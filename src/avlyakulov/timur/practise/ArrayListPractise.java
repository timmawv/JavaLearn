package avlyakulov.timur.practise;

import java.util.ArrayList;

public class ArrayListPractise {
    public static void main(String[] args) {
        Student st1 = new Student("Alex",22,"ITINF-19-2");
        Student st2 = new Student("Dasha",18,"ITINF-21-2");
        Student st3 = new Student("Timur",20,"ITINF-19-2");
        Student st4 = new Student("Artem",21,"ITINF-18-2");
        Student st5 = new Student("Dima",19,"KN-19-2");
        Student st6 = new Student("Dima",19,"KN-19-2");
        ArrayList <Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);
        System.out.println(studentArrayList);
        studentArrayList.remove(st6);
        System.out.println(studentArrayList);
    }
}
