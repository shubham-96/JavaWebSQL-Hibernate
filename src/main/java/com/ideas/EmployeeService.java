package com.ideas;

import java.util.List;

public class EmployeeService {

	private static EmployeeRepo employeeRepo;

	public EmployeeService(EmployeeRepo employeeRepo) {
		EmployeeService.employeeRepo = employeeRepo;
	}

	public static List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	public void saveEmployees(Employee employee) {
		employeeRepo.save(employee);
	}
	
	public void deleteAllEmployees() {
		employeeRepo.deleteAll();
	}
}