package pl.rlechowicz.sklep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlechowicz.sklep.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //

}
