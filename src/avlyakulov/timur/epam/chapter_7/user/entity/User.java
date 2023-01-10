package avlyakulov.timur.epam.chapter_7.user.entity;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}' + '\n';
    }
}
