package avlyakulov.timur.epam.chapter_9.example.custom_exception;


public class ResourceException extends Exception {
    public ResourceException() {
    }

    public ResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceException(String message) {
        super(message);
    }

    public ResourceException(Throwable cause) {
        super(cause);
    }
}