package avlyakulov.timur.self_practise.other.relation;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee_task")
@NoArgsConstructor
@Getter
@Setter
public class EmployeeTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

//    @ManyToMany
//    @JoinTable(name = "employee_tasks",
//            joinColumns = @JoinColumn(name = "task_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "id"))
//    private List<Employee> employees = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public EmployeeTask(String name) {
        this.name = name;
    }
}