package avlyakulov.timur.self_practise.other.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonAddress {

    @Column(name = "person_country")
    private String country;

    @Column(name = "person_city")
    private String city;

}
