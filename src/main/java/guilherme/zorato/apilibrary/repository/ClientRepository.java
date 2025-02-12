package guilherme.zorato.apilibrary.repository;


import guilherme.zorato.apilibrary.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query(value = "SELECT * FROM client WHERE cli_cpf = :cpf", nativeQuery = true)
    Client findCpf(@Param("cpf") String cpf);
}
