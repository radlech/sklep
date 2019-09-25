package pl.rlechowicz.sklep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlechowicz.sklep.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    //

}
