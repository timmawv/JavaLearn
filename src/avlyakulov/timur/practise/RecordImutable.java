package avlyakulov.timur.practise;

public record RecordImutable(String name, int id) {
    void printAboutRecord () {
        System.out.println("This is record");
    }
}