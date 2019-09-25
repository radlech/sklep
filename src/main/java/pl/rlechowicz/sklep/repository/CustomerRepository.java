package pl.rlechowicz.sklep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlechowicz.sklep.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //

}
