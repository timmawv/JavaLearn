package avlyakulov.timur.epam.chapter_3.student.entity;
/* Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,Факультет, Курс, Группа.
        Создать массив объектов. Вывести:
        a) список студентов заданного факультета;
        b) списки студентов для каждого факультета и курса;
        c) список студентов, родившихся после заданного года;
        d) список учебной группы.
*/

public class Student {
    private String id;
    private String name;
    private String surname;
    private String dateBirth;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;

    private String group;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname=" + surname + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group +
                '}';
    }

}