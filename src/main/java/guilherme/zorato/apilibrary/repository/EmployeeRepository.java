package guilherme.zorato.apilibrary.repository;

import guilherme.zorato.apilibrary.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
