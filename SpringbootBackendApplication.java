package nimap.java.springboot_backend;

import nimap.java.springboot_backend.model.Employee;
import nimap.java.springboot_backend.repository.EmployeeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Divya");
		employee.setLastName("Borude");
		employee.setEmailId("divya@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Pratibha");
		employee1.setLastName("Borude");
		employee1.setEmailId("prati@gmail.com");
		employeeRepository.save(employee1);
	}
}
