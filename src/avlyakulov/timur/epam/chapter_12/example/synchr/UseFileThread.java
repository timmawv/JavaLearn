package avlyakulov.timur.epam.chapter_12.example.synchr;

public class UseFileThread extends Thread {
    private CommonResource resource;

    public UseFileThread(String name, CommonResource resource) {
        super(name);
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; ++i) {
            resource.writing(this.getName(), i); //synchr method call
        }
    }

}