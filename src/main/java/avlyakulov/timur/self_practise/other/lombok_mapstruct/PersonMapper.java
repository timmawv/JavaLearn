package avlyakulov.timur.self_practise.other.lombok_mapstruct;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "personName", source = "person.name")
    @Mapping(target = "personPhone", source = "person.phone")
    @Mapping(target = "addressDTO", source = "person.address")
    PersonDTO mapToPersonResponse(Person person);


    List<PersonDTO> mapToListPersonResponse(List<Person> persons);

    @Mapping(target = "personCountry", source = "address.country")
    @Mapping(target = "personCity", source = "address.city")
    AddressDTO mapToAddressDTO(Address address);

}