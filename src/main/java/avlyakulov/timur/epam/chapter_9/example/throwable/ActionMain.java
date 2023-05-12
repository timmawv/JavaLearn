package avlyakulov.timur.epam.chapter_9.example.throwable;

public class ActionMain {
    public static void main(String[] args) {
        Resource resource = new Resource();
        System.out.println(resource);
        ThrowableExceptions.load(resource);
    }
}
