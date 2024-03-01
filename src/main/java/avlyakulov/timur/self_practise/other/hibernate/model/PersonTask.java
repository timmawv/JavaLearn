package avlyakulov.timur.self_practise.other.hibernate.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "person_task")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "person")
public class PersonTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_task")
    private String nameTask;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public PersonTask(String nameTask) {
        this.nameTask = nameTask;

    }
}