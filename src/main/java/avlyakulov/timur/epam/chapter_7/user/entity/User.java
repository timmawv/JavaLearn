package avlyakulov.timur.epam.chapter_7.user.entity;

import java.util.Comparator;
import java.util.Objects;

/*
Написать класс Пользователь с полями: id, имя, возраст, страна. Создать
массив Пользователей. Отсортировать по стране и возрасту. Выбрать всех
Пользователей старше заданного возраста, первая буква имени у которых
начинается с заданной буквы. Получить максимальный и минимальный
элемент в сгруппированном результате по возрасту.
 */
public class User {
    private int id;
    private final String name;
    private int age;
    private String country;

    public User(int id, String name,int age,String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
    }
    public int getAge() {
        return age;
    }
    public String getCountry () {
        return country;
    }
    public String getName () {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(name, user.name) && Objects.equals(country, user.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, country);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}' + '\n';
    }
    public static class AgeComparator implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return Integer.compare(o1.getAge(),o2.getAge());
        }
    }
    public static class CountryComparator implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getCountry(), o2.getCountry());
        }
    }
}