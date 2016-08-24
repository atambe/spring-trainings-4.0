package com.cg.demo;
/*
 *  You can apply @Autowired only to one constructor. If you apply @Autowired to more than one constructor, 
 *  Spring will complain during bootstrapping the application.
 *  
 *  In that case you can annotate one constructor and inject others through XML configuration file.
 */


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service("employee")
public class Employee {
	
	Department department;

@Autowired
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
