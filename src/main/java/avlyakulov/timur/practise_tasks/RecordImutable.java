package avlyakulov.timur.practise_tasks;

public record RecordImutable(String name, int id) {
    void printAboutRecord () {
        System.out.println("This is record");
    }
}