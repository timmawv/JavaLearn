package avlyakulov.timur.epam.chapter_8.example.builder;

public class RefStringBuilder {
    public static void changeStringBuilder (StringBuilder builder) {
        builder.append(" Certified");
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Oracle");
        changeStringBuilder(str);
        System.out.println(str);
        /* Объект StringBuilder передан в метод changeStringBuilder() по ссылке, по-
           этому все изменения объекта сохраняются и для вызывающего метода */
    }
}