package avlyakulov.timur.practise.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class C extends A{
    public C (String name, int mode) throws IOException {
        super(name);
    }
    public C (String name, int mode, String type) throws FileNotFoundException {
        super(name);
    }
}
