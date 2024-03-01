package avlyakulov.timur.self_practise.other.relation;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

//    @ManyToMany
//    @JoinTable(name = "employee_tasks",
//            joinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "task_id", referencedColumnName = "id"))
//    private List<EmployeeTask> employeeTasks = new ArrayList<>();

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private EmployeeTask employeeTask;

    public Employee(String name) {
        this.name = name;
    }
}