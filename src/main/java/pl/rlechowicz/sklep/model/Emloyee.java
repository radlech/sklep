package pl.rlechowicz.sklep.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class Emloyee {

    @Id
    @SequenceGenerator(sequenceName = "employee_seq", name = "employee__seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "employee_seq")
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "job_title", nullable = false)
    private String jobTitle;

}