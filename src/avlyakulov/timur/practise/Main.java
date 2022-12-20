package avlyakulov.timur.practise;

import java.util.ArrayList;
import java.util.Objects;

public class Main {



    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Alex",12,"ITIFN"));
        StudentWorker object = new StudentWorker("Alex",12,"ITIFN");
        studentArrayList.add(object);

    }
}