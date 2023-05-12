package avlyakulov.timur.epam.chapter_11.example.stream.streamfull.entity;


public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private int age;
    private Position position;

    public Employee(String firstName, String lastName, int id, int age, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", position=" + position +
                '}';
    }
}
