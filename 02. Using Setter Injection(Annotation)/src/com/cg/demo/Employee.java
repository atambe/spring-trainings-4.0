package com.cg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employee")
public class Employee {
	
	Department department;

	public Department getDepartment() {
		return department;
	}
@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + "]";
	}
	
}
