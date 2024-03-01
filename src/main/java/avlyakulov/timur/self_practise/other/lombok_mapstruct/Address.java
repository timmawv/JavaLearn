package avlyakulov.timur.self_practise.other.lombok_mapstruct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Address {

    private String country;

    private String city;

    private String postCode;
}
