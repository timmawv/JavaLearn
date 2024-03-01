package avlyakulov.timur.self_practise.other.lombok_mapstruct;

import avlyakulov.timur.self_practise.other.hibernate.model.Phone;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    private int id;

    private String name;

    private Phone phone;

    private Address address;
}