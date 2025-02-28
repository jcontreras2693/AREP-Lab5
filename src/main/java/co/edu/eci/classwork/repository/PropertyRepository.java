package co.edu.eci.classwork.repository;

import co.edu.eci.classwork.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {

}
