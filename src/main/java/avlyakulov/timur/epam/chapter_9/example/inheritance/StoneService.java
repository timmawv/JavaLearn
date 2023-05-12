package avlyakulov.timur.epam.chapter_9.example.inheritance;

public class StoneService {
    public void buildHouse (Stone stone) {
        try {
            stone.accept("some info");
        }
        catch (Exception e) {
            // handling of ResourceException and its subclasses
            System.err.println(e.getMessage());
        }
    }
}
