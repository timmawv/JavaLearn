package avlyakulov.timur.self_practise.other.lombok_mapstruct;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PersonDTO {

    private String personName;

    private AddressDTO addressDTO;
}