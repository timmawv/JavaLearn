package avlyakulov.timur.practise.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class B extends A {
    public B(String name) throws FileNotFoundException {
        super(name);
    }

    public B() throws IOException {
        super("file.txt");
    }
}