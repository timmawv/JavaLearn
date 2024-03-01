package avlyakulov.timur.self_practise.other.lombok_mapstruct;

import avlyakulov.timur.dto.MatchFinishedResponse;
import avlyakulov.timur.mapper.MatchMapper;
import avlyakulov.timur.model.Match;
import avlyakulov.timur.model.Player;
import avlyakulov.timur.model.State;

public class Test {

    public static void main(String[] args) {
//        Address address = new Address("Ukraine", "Kharkiv", "61000");
//        Person timur = new Person(1, "Timur", Phone.IPHONE, address);
//        Person dima = new Person(2, "Dima", Phone.IPHONE, address);
//        List<Person> persons = List.of(timur, dima);
        Player timur = new Player("Timur");
        Player dima = new Player("Dima");
        Match match = new Match(timur, dima, 0, 0, 0, 0, 2, 0, State.FINISHED);

        MatchFinishedResponse matchFinishedResponse = MatchMapper.INSTANCE.mapToMatchFinishedResponse(match, timur);
        int a = 123;
    }
}