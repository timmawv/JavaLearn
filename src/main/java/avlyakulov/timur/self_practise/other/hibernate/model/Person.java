package avlyakulov.timur.self_practise.other.hibernate.model;

import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "person")
@NamedQueries({
        @NamedQuery(name = "HQL_FindAllPerson",
                query = "from Person p order by p.id"),
        @NamedQuery(name = "HQL_FindPersonByName",
                query = "from Person where name = :personName")
})
@NamedNativeQueries({
        @NamedNativeQuery(
                name = "SQL_FindPersonByID",
                query = "select * from person; ",
                resultClass = Person.class
        )
})

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private Integer age;

    @Column(name = "phone_user")
    @Enumerated(EnumType.STRING)
    private Phone phone;

    @Formula(value = "age * 2")
    private Integer doubleAge;

    @Embedded
    private PersonAddress personAddress;

    //todo fix it how to deal with collection
//    @ElementCollection
//    @CollectionTable(name="user_message",
//            indexes = { @Index(columnList = "list_index") },
//            joinColumns = @JoinColumn(name = "person_id", referencedColumnName = "id"))
//    @Column(name = "message")
//    private List<String> messages;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "person")
    private List<PersonTask> personTaskList = new ArrayList<>();


    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    private Date createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date")
    private Date modifyDate;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}