package avlyakulov.timur.epam.chapter_9.example.inheritance;

import java.io.FileWriter;
import java.io.IOException;

public class GreyStone extends Stone {

    @Override
    public void accept (String data) throws IOException {
        FileWriter fl = new FileWriter("data.txt");
    }

}