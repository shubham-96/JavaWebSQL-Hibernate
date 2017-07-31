package com.ideas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {

	private static Connection connection;

	public EmployeeRepo(Connection connection) {
		EmployeeRepo.connection = connection;
	}

	public EmployeeRepo() {
		// TODO Auto-generated constructor stub
	}

	public  List<Employee> findAll() {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		try {
			ResultSet rs = connection.createStatement().executeQuery("SELECT Employee_ID,"
					+ " NAME, Company_Employee_ID, Contact_No," + " Self, Gender, Department FROM employee");
			while (rs.next()) {
				Employee employee = new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7));
				employees.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
	
	public Employee findById(String empID) {
		Employee employee = null;
		try {
			ResultSet rs = connection.createStatement().executeQuery("SELECT Employee_ID,"
					+ " NAME, Company_Employee_ID, Contact_No, Self, Gender, Department FROM employee WHERE Employee_ID = '" + empID + "'");
			if(rs.getString(1) == empID) {
				employee = new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	public void save(Employee employee) {
		try {
			connection.createStatement().executeUpdate(
					"INSERT INTO Employee (NAME, Company_Employee_ID, Contact_No, Self, Gender, Department) "
							+ "VALUES ('" + employee.getName() + "', '" + employee.getCompanyEmployeeID() + "', '"
							+ employee.getContactNumber() + "', '" + employee.getSelf() + "', '" + employee.getGender()
							+ "', '" + employee.getDepartment() + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteAll() {
		try {
			connection.createStatement().executeUpdate("TRUNCATE Employee");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteByName(Employee employee) {
		try {
			connection.createStatement().executeUpdate("DELETE FROM Employee WHERE NAME = '" + employee.getName() + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
