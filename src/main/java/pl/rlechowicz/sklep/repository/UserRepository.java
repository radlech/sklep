package pl.rlechowicz.sklep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.rlechowicz.sklep.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query
    Optional<User> findByEmail(String email);

}
