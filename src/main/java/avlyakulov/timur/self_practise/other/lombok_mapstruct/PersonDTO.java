package avlyakulov.timur.self_practise.other.lombok_mapstruct;

import avlyakulov.timur.self_practise.other.hibernate.model.Phone;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PersonDTO {

    private String personName;

    private Phone personPhone;

    private AddressDTO addressDTO;
}