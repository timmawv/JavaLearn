package avlyakulov.timur.epam.chapter_9.example.throwable;

public class ThrowableExceptions {
    public static void load (Resource resource) {
        if (resource == null || !resource.exists() || !resource.isCreate()) {
            throw new IllegalArgumentException();
            // better custom exception, e.g., throw new ResourceException();
        }
    }
}