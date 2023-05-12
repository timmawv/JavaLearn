package avlyakulov.timur.epam.chapter_9.example.custom_exception;

import avlyakulov.timur.epam.chapter_9.example.throwable.Resource;

public class ResourceAction {
    public static void load(Resource resource) throws ResourceException {
        if (resource == null || !resource.exists())
            throw new ResourceException("The object is not create correctly");
    }
}
