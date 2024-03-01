package avlyakulov.timur.self_practise.other.hibernate.test;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Humans")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
        @NamedQuery(
                name = "findByName",
                query = "from Human where name = :name"
        )
})
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name", unique = true)
    private String name;

    public Human(String name) {
        this.name = name;
    }
}
