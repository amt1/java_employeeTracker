package com.codeclan.employee.employee;

import com.codeclan.employee.employee.models.Employee;
import com.codeclan.employee.employee.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee ben = new Employee("ben", 27, 426485, "marlow.singer@gmail.com");
		employeeRepository.save(ben);
	}

}
