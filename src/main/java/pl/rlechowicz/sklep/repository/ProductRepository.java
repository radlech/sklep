package pl.rlechowicz.sklep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlechowicz.sklep.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    //

}
