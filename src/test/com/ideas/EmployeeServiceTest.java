package com.ideas;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class EmployeeServiceTest {

	@Test
	public void ShowAllEmployees () {
		EmployeeRepo employeeRepo = Mockito.mock(EmployeeRepo.class);
		//EmployeeService employeeService = new EmployeeService(employeeRepo);
 		Mockito.when(employeeRepo.findAll()).thenReturn(Arrays.asList(new Employee()));
		List<Employee> employees = EmployeeService.getAllEmployees();
		assertEquals(1,employees.size());
	}
	
	@Test
	public void SaveEmployee () {
		EmployeeRepo employeeRepo = Mockito.mock(EmployeeRepo.class);
		EmployeeService employeeService = new EmployeeService(employeeRepo);
		Employee employee = new Employee();
		employeeService.saveEmployees(employee);
		Mockito.verify(employeeRepo).save(employee);
	}
	
	/*@Test
	public void deleteEmployees() {
		EmployeeRepo employeeRepo = Mockito.mock(EmployeeRepo.class);
		EmployeeService employeeService = new EmployeeService(employeeRepo);
		employeeService.deleteAllEmployees();
		Mockito.verify(employeeRepo).deleteAll();
	}*/
}
