package pl.rlechowicz.sklep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlechowicz.sklep.model.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long> {

    //

}
