package pl.rlechowicz.sklep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlechowicz.sklep.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    //

}
