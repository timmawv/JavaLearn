package avlyakulov.timur.self_practise.other.lombok_mapstruct;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    private int id;

    private String name;

    private Address address;
}