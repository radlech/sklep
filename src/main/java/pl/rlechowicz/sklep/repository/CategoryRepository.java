package pl.rlechowicz.sklep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlechowicz.sklep.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    //

}