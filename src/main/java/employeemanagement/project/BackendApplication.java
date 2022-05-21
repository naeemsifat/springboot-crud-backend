package employeemanagement.project;

import employeemanagement.project.model.Employee;
import employeemanagement.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
    @Autowired
    private EmployeeRepository employeeRepository;    
        
    @Override
    public void run(String... args) throws Exception {
         Employee employee = new Employee();
//         employee.setFirstName("naeem");
//         employee.setLastName("sifat");
//         employee.setEmailId("sifatnaeem35@gmail.com");
//         employeeRepository.save(employee);
//         
//         Employee employee1 = new Employee();
//         employee1.setFirstName("sumit");
//         employee1.setLastName("saha");
//         employee1.setEmailId("sumitsaha45@gmail.com");
//         employeeRepository.save(employee1);
    }

}
