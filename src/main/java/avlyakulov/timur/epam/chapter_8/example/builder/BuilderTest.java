package avlyakulov.timur.epam.chapter_8.example.builder;

public class BuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("length " + builder.length());
        System.out.println("capacity " + builder.capacity());
        builder.append("Java");
        System.out.println("content " + builder);
        System.out.println("length " + builder.length());
        System.out.println("capacity " + builder.capacity());
        builder.append("Internationalization");
        System.out.println("content = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
        System.out.println("reverse = " + builder.reverse());

    }
}