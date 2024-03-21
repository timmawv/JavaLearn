package avlyakulov.timur.self_practise.other.lombok_mapstruct;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Address address = new Address("Ukraine", "Kharkiv", "61000");
        Person timur = new Person(1, "Timur", address);
        Person dima = new Person(2, "Dima", address);
        List<Person> persons = List.of(timur, dima);

        int a = 123;
    }
}