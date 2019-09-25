package pl.rlechowicz.sklep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlechowicz.sklep.model.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {

    //

}
