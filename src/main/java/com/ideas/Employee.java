package com.ideas;

public class Employee {
	private String employeeId, name, companyEmployeeID, contactNumber, self, gender, department;
	
	
	public Employee(String employeeId, String name, String companyEmployeeID,
					String contact_Number, String self, String gender, String department) {
		this.employeeId = employeeId;
		this.name = name;
		this.companyEmployeeID = companyEmployeeID;
		this.contactNumber = contact_Number;
		this.self = self;
		this.gender = gender;
		this.department = department;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object obj){
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;	
		Employee emp = (Employee) obj;
		if (this.employeeId.equals(emp.employeeId) && this.name.equals(emp.name))
				return true;
		return false;
	}

	public String getName() {
		return this.name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getCompanyEmployeeID() {
		return companyEmployeeID;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getSelf() {
		return self;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}
	
}
