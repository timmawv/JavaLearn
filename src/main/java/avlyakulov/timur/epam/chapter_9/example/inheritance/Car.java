package avlyakulov.timur.epam.chapter_9.example.inheritance;

import java.io.IOException;

public class Car {
    public Car() throws IOException {
    }
}

class GreenCar extends Car {
    public GreenCar() throws Exception {
    }
}

class GreenCarTesla extends Car {
    public GreenCarTesla() throws Throwable {
    }
}

class TeslaCar extends Car {
    /*public TeslaCar () throws FileNotFoundException { нельзя создать такой конструктор который имеет наследников конструктора исключений объвленных
    в супер классе.

    }*/
    public TeslaCar() throws IOException {}
}