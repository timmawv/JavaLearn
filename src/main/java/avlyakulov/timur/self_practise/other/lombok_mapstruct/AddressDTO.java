package avlyakulov.timur.self_practise.other.lombok_mapstruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class AddressDTO {

    private String personCountry;

    private String personCity;
}
