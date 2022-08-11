package avlyakulov.timur.book.chapter_3.student.entity;
/* Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,Факультет, Курс, Группа.
        Создать массив объектов. Вывести:
        a) список студентов заданного факультета;
        b) списки студентов для каждого факультета и курса;
        c) список студентов, родившихся после заданного года;
        d) список учебной группы.
*/

public class Student {
    private int id;
    private String Surname;
    private String name;
    private String patronymic;
    private String date;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;
    private Student[] students;

    private Student () {}

}