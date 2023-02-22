package avlyakulov.timur.epam.chapter_9.example.inheritance;

import avlyakulov.timur.epam.chapter_9.example.custom_exception.ResourceException;

public class WhiteStone extends Stone {
    @Override
    public void accept (String data) throws ResourceException {
        super.accept(data);
    }
}
