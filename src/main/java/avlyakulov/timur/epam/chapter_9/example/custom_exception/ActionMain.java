package avlyakulov.timur.epam.chapter_9.example.custom_exception;

import avlyakulov.timur.epam.chapter_9.example.throwable.Resource;

import java.io.FileReader;
import java.io.IOException;

public class ActionMain {
    public static void main(String[] args) {
        Resource resource = new Resource();
        try {
            ResourceAction.load(resource);
        } catch (ResourceException e) {
            System.out.println(e.getMessage());
        }
    }

    public int loadFile(String filename) throws ResourceException {
        int data;
        try (FileReader reader = new FileReader(filename)) {
            data = reader.read();
        } catch (IOException e) {
            throw new ResourceException(e);
        }
        return data;
    }
}
