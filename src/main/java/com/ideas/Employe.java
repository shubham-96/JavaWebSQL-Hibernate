package com.ideas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
		@NamedQuery(name = "FIND_BY_NAME", query = "select emp from Employe emp where emp.name = :empName"),
		@NamedQuery(name = "FIND_BY_ID", query = "select emp from Employe emp where emp.employeeId = :empID") })

@Entity
@Table(name = "Employee")
public class Employe {

	private Integer employeeId;
	private String name;
	private Integer companyEmployeeID;
	private long contactNumber;
	private boolean self;
	private String gender;
	private String department;
	
	@Id
	@Column(name = "Employee_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Company_Employee_ID")
	public Integer getCompanyEmployeeID() {
		return companyEmployeeID;
	}

	public void setCompanyEmployeeID(Integer companyEmployeeID) {
		this.companyEmployeeID = companyEmployeeID;
	}

	@Column(name = "Contact_No")
	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Column(name = "Self")
	public boolean getSelf() {
		return self;
	}

	public void setSelf(boolean self) {
		this.self = self;
	}

	@Column(name = "Gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "Department")
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
