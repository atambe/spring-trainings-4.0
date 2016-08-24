package com.cg.demo;

public class Employee {
	Department department;

	public Employee(Department department) {
		super();
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + "]";
	}
	
}
