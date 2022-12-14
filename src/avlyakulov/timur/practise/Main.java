package avlyakulov.timur.practise;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Alex",12,"Itinf");
        System.out.println(student.getClass());
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);
        System.out.println(studentClass.toGenericString());
    }
}