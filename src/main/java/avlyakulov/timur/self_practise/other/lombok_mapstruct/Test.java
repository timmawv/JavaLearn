package avlyakulov.timur.self_practise.other.lombok_mapstruct;

import avlyakulov.timur.self_practise.other.hibernate.model.Phone;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Address address = new Address("Ukraine", "Kharkiv", "61000");
        Person timur = new Person(1, "Timur", Phone.IPHONE, address);
        Person dima = new Person(2, "Dima", Phone.IPHONE, address);
        List<Person> persons = List.of(timur, dima);

        int a = 123;
    }
}