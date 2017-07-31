package com.ideas;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ideas.Employee;

public class EmployeeTest {

	@Test
	public void employeeIsNotNull() {
		//given
		Employee emp = new Employee();
		
		//when
		boolean comparisonResult = emp.equals(null);
		
		//then
		assertFalse(comparisonResult);
	}
	
	@Test
	public void employeeIsEqualToItself() {
		//given
		Employee employee = new Employee();
		
		//when
		boolean compareSelf = employee.equals(employee);
		//then
		assertTrue(compareSelf);
	}
	
	@Test
	public void employeesAreNotEqual() {
		//given
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//when
		boolean compareEmployees = emp1.equals(emp2); 
		
		//then
		assertFalse(compareEmployees);
	}
}
