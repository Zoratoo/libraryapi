package guilherme.zorato.apilibrary.repository;

import guilherme.zorato.apilibrary.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RentalRepository extends JpaRepository<Rental, Long> {
    @Query(value = "SELECT * FROM rental WHERE cli_id = :id", nativeQuery = true)
    List<Rental> findRentalsByClientId(Long id);
}
