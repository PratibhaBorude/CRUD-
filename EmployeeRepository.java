package nimap.java.springboot_backend.repository;
import nimap.java.springboot_backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee,Long> {



}
