package com.ideas;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeRepositoryTest {
	private EmployeeRepo employeeRepo;
	
	@BeforeClass
	public void init() {
		employeeRepo = new EmployeeRepo(ConnectionManager.getConnection());
	}
	
	@Before
	public void cleanTable() {
		try {
			ConnectionManager.getConnection().createStatement().executeUpdate("TRUNCATE Employee");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void emptyRepoToReturnNothing() {
		List<Employee> employees = employeeRepo.findAll();
		assertEquals(0, employees.size());	
	}
	
	@Test
	public void findAllEmployees() {
		
		List<Employee> employees = employeeRepo.findAll();
		
		assertEquals(1, employees.size());
		assertEquals("Shubham", employees.get(0).getName());
	}
	
	@Test
	public void ToSaveEmployee() {
		Employee employee = new Employee("1", "Shubham", "1", "9511618418", "1", "MALE", "SD");
		employeeRepo.save(employee);
		
		assertEquals(1, employeeRepo.findAll().size());
	}
	
	@Test
	public void deleteAllRecords() {
		
		employeeRepo.deleteAll();
		
		assertEquals(0, employeeRepo.findAll().size());
	}
}
